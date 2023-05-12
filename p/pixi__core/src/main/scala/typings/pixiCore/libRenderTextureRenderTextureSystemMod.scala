package typings.pixiCore

import typings.pixiColor.libColorMod.ColorSource
import typings.pixiConstants.mod.BUFFER_BITS
import typings.pixiCore.libMaskMaskDataMod.MaskData
import typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderTextureRenderTextureSystemMod {
  
  @JSImport("@pixi/core/lib/renderTexture/RenderTextureSystem", "RenderTextureSystem")
  @js.native
  open class RenderTextureSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    /** Does the renderer have alpha and are its color channels stored premultipled by the alpha channel? */
    /* private */ var _rendererPremultipliedAlpha: Any = js.native
    
    /**
      * Bind the current render texture.
      * @param renderTexture - RenderTexture to bind, by default its `null` - the screen.
      * @param sourceFrame - Part of world that is mapped to the renderTexture.
      * @param destinationFrame - Part of renderTexture, by default it has the same size as sourceFrame.
      */
    def bind(): Unit = js.native
    def bind(renderTexture: Unit, sourceFrame: Unit, destinationFrame: Rectangle): Unit = js.native
    def bind(renderTexture: Unit, sourceFrame: Rectangle): Unit = js.native
    def bind(renderTexture: Unit, sourceFrame: Rectangle, destinationFrame: Rectangle): Unit = js.native
    def bind(renderTexture: RenderTexture): Unit = js.native
    def bind(renderTexture: RenderTexture, sourceFrame: Unit, destinationFrame: Rectangle): Unit = js.native
    def bind(renderTexture: RenderTexture, sourceFrame: Rectangle): Unit = js.native
    def bind(renderTexture: RenderTexture, sourceFrame: Rectangle, destinationFrame: Rectangle): Unit = js.native
    
    /**
      * Erases the render texture and fills the drawing area with a colour.
      * @param clearColor - The color as rgba, default to use the renderer backgroundColor
      * @param [mask=BUFFER_BITS.COLOR | BUFFER_BITS.DEPTH] - Bitwise OR of masks
      *  that indicate the buffers to be cleared, by default COLOR and DEPTH buffers.
      */
    def clear(): Unit = js.native
    def clear(clearColor: Unit, mask: BUFFER_BITS): Unit = js.native
    def clear(clearColor: ColorSource): Unit = js.native
    def clear(clearColor: ColorSource, mask: BUFFER_BITS): Unit = js.native
    
    /* protected */ def contextChange(): Unit = js.native
    
    /**
      * Render texture currently bound. {@code null} if rendering to the canvas.
      * @readonly
      */
    var current: RenderTexture | Null = js.native
    
    /**
      * List of masks for the {@link PIXI.StencilSystem}.
      * @readonly
      */
    var defaultMaskStack: js.Array[MaskData] = js.native
    
    /**
      * The destination frame for the render-target's projection mapping.
      *
      * See {@link PIXI.ProjectionSystem#destinationFrame} for more details.
      */
    val destinationFrame: Rectangle = js.native
    
    @JSName("destroy")
    def destroy_MRenderTextureSystem(): Unit = js.native
    
    /* private */ var renderer: Any = js.native
    
    /** Resets render-texture state. */
    def reset(): Unit = js.native
    
    def resize(): Unit = js.native
    
    /**
      * The source frame for the render-target's projection mapping.
      *
      * See {@link PIXI.ProjectionSystem#sourceFrame} for more details
      */
    val sourceFrame: Rectangle = js.native
    
    /**
      * The viewport frame for the render-target's viewport binding. This is equal to the destination-frame
      * for render-textures, while it is y-flipped when rendering to the screen (i.e. its origin is always on
      * the bottom-left).
      */
    val viewportFrame: Rectangle = js.native
  }
  /* static members */
  object RenderTextureSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/renderTexture/RenderTextureSystem", "RenderTextureSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
