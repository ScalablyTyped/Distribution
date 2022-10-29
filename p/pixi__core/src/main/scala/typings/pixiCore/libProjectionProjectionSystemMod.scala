package typings.pixiCore

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Matrix
import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectionProjectionSystemMod {
  
  @JSImport("@pixi/core/lib/projection/ProjectionSystem", "ProjectionSystem")
  @js.native
  open class ProjectionSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /** @param renderer - The renderer this System works for. */
    def this(renderer: Renderer) = this()
    
    /**
      * Calculates the `projectionMatrix` to map points inside `sourceFrame` to inside `destinationFrame`.
      * @param _destinationFrame - The destination frame in the render-target.
      * @param sourceFrame - The source frame in world space.
      * @param _resolution - The render-target's resolution, i.e. ratio of CSS to physical pixels.
      * @param root - Whether rendering into the screen. Otherwise, if rendering to a framebuffer, the projection
      *  is y-flipped.
      */
    def calculateProjection(_destinationFrame: Rectangle, sourceFrame: Rectangle, _resolution: Double, root: Boolean): Unit = js.native
    
    /**
      * Default destination frame
      *
      * This is not used internally. It is not advised to use this feature specifically unless you know what
      * you're doing. The `update` method will default to this frame if you do not pass the destination frame.
      * @readonly
      */
    var defaultFrame: Rectangle = js.native
    
    /**
      * The destination frame used to calculate the current projection matrix.
      *
      * The destination frame is the rectangle in the render-target into which contents are rendered. If rendering
      * to the screen, the origin is on the top-left. If rendering to a framebuffer, the origin is on the
      * bottom-left. This "flipping" phenomenon is because of WebGL convention for (shader) texture coordinates, where
      * the bottom-left corner is (0,0). It allows display-objects to map their (0,0) position in local-space (top-left)
      * to (0,0) in texture space (bottom-left). In other words, a sprite's top-left corner actually renders the
      * texture's bottom-left corner. You will also notice this when using a tool like SpectorJS to view your textures
      * at runtime.
      *
      * The destination frame's dimensions (width,height) should be equal to the source frame. This is because,
      * otherwise, the contents will be scaled to fill the destination frame. Similarly, the destination frame's (x,y)
      * coordinates are (0,0) unless you know what you're doing.
      * @readonly
      */
    var destinationFrame: Rectangle = js.native
    
    @JSName("destroy")
    def destroy_MProjectionSystem(): Unit = js.native
    
    /**
      * Projection matrix
      *
      * This matrix can be used to transform points from world space to normalized device coordinates, and is calculated
      * from the sourceFrame → destinationFrame mapping provided.
      *
      * The renderer's `globalUniforms` keeps a reference to this, and so it is available for all shaders to use as a
      * uniform.
      * @readonly
      */
    var projectionMatrix: Matrix = js.native
    
    /* private */ var renderer: Any = js.native
    
    /**
      * Sets the transform of the active render target to the given matrix.
      * @param _matrix - The transformation matrix
      */
    def setTransform(_matrix: Matrix): Unit = js.native
    
    /**
      * The source frame used to calculate the current projection matrix.
      *
      * The source frame is the rectangle in world space containing the contents to be rendered.
      * @readonly
      */
    var sourceFrame: Rectangle = js.native
    
    /**
      * A transform to be appended to the projection matrix.
      *
      * This can be used to transform points in world-space one last time before they are outputted by the shader. You can
      * use to rotate the whole scene, for example. Remember to clear it once you've rendered everything.
      * @member {PIXI.Matrix}
      */
    var transform: Matrix = js.native
    
    /**
      * Updates the projection-matrix based on the sourceFrame → destinationFrame mapping provided.
      *
      * NOTE: It is expected you call `renderer.framebuffer.setViewport(destinationFrame)` after this. This is because
      * the framebuffer viewport converts shader vertex output in normalized device coordinates to window coordinates.
      *
      * NOTE-2: {@link RenderTextureSystem#bind} updates the projection-matrix when you bind a render-texture. It is expected
      * that you dirty the current bindings when calling this manually.
      * @param destinationFrame - The rectangle in the render-target to render the contents into. If rendering to the canvas,
      *  the origin is on the top-left; if rendering to a render-texture, the origin is on the bottom-left.
      * @param sourceFrame - The rectangle in world space that contains the contents being rendered.
      * @param resolution - The resolution of the render-target, which is the ratio of
      *  world-space (or CSS) pixels to physical pixels.
      * @param root - Whether the render-target is the screen. This is required because rendering to textures
      *  is y-flipped (i.e. upside down relative to the screen).
      */
    def update(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit = js.native
  }
  /* static members */
  object ProjectionSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/projection/ProjectionSystem", "ProjectionSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
