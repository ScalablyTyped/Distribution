package typings.phaser.Phaser.Display

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Display.Masks")
@js.native
object Masks extends js.Object {
  
  /**
    * A Bitmap Mask combines the alpha (opacity) of a masked pixel with the alpha of another pixel.
    * Unlike the Geometry Mask, which is a clipping path, a Bitmap Mask behaves like an alpha mask,
    * not a clipping path. It is only available when using the WebGL Renderer.
    * 
    * A Bitmap Mask can use any Game Object to determine the alpha of each pixel of the masked Game Object(s).
    * For any given point of a masked Game Object's texture, the pixel's alpha will be multiplied by the alpha
    * of the pixel at the same position in the Bitmap Mask's Game Object. The color of the pixel from the
    * Bitmap Mask doesn't matter.
    * 
    * For example, if a pure blue pixel with an alpha of 0.95 is masked with a pure red pixel with an
    * alpha of 0.5, the resulting pixel will be pure blue with an alpha of 0.475. Naturally, this means
    * that a pixel in the mask with an alpha of 0 will hide the corresponding pixel in all masked Game Objects
    *  A pixel with an alpha of 1 in the masked Game Object will receive the same alpha as the
    * corresponding pixel in the mask.
    * 
    * The Bitmap Mask's location matches the location of its Game Object, not the location of the
    * masked objects. Moving or transforming the underlying Game Object will change the mask
    * (and affect the visibility of any masked objects), whereas moving or transforming a masked object
    * will not affect the mask.
    * 
    * The Bitmap Mask will not render its Game Object by itself. If the Game Object is not in a
    * Scene's display list, it will only be used for the mask and its full texture will not be directly
    * visible. Adding the underlying Game Object to a Scene will not cause any problems - it will
    * render as a normal Game Object and will also serve as a mask.
    */
  @js.native
  trait BitmapMask extends js.Object {
    
    /**
      * A renderable Game Object that uses a texture, such as a Sprite.
      */
    var bitmapMask: GameObject = js.native
    
    /**
      * Destroys this BitmapMask and nulls any references it holds.
      * 
      * Note that if a Game Object is currently using this mask it will _not_ automatically detect you have destroyed it,
      * so be sure to call `clearMask` on any Game Object using it, before destroying it.
      */
    def destroy(): Unit = js.native
    
    /**
      * Whether the Bitmap Mask is dirty and needs to be updated.
      */
    var dirty: Boolean = js.native
    
    /**
      * Whether to invert the masks alpha.
      * 
      * If `true`, the alpha of the masking pixel will be inverted before it's multiplied with the masked pixel. Essentially, this means that a masked area will be visible only if the corresponding area in the mask is invisible.
      */
    var invertAlpha: Boolean = js.native
    
    /**
      * Is this mask a stencil mask?
      */
    val isStencil: Boolean = js.native
    
    /**
      * The framebuffer to which a masked Game Object is rendered.
      */
    var mainFramebuffer: WebGLFramebuffer = js.native
    
    /**
      * The texture used for the main framebuffer.
      */
    var mainTexture: WebGLTexture = js.native
    
    /**
      * The framebuffer to which the Bitmap Mask's masking Game Object is rendered.
      */
    var maskFramebuffer: WebGLFramebuffer = js.native
    
    /**
      * The texture used for the mask's framebuffer.
      */
    var maskTexture: WebGLTexture = js.native
    
    /**
      * This is a NOOP method. Bitmap Masks are not supported by the Canvas Renderer.
      * @param renderer The Canvas Renderer which would be rendered to.
      */
    def postRenderCanvas(renderer: CanvasRenderer): Unit = js.native
    def postRenderCanvas(renderer: WebGLRenderer): Unit = js.native
    
    /**
      * Finalizes rendering of a masked Game Object.
      * 
      * This resets the previously bound framebuffer and switches the WebGL Renderer to the Bitmap Mask Pipeline, which uses a special fragment shader to apply the masking effect.
      * @param renderer The WebGL Renderer to clean up.
      */
    def postRenderWebGL(renderer: CanvasRenderer): Unit = js.native
    def postRenderWebGL(renderer: WebGLRenderer): Unit = js.native
    
    /**
      * This is a NOOP method. Bitmap Masks are not supported by the Canvas Renderer.
      * @param renderer The Canvas Renderer which would be rendered to.
      * @param mask The masked Game Object which would be rendered.
      * @param camera The Camera to render to.
      */
    def preRenderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera): Unit = js.native
    def preRenderCanvas(renderer: WebGLRenderer, mask: GameObject, camera: Camera): Unit = js.native
    
    /**
      * Prepares the WebGL Renderer to render a Game Object with this mask applied.
      * 
      * This renders the masking Game Object to the mask framebuffer and switches to the main framebuffer so that the masked Game Object will be rendered to it instead of being rendered directly to the frame.
      * @param renderer The WebGL Renderer to prepare.
      * @param maskedObject The masked Game Object which will be drawn.
      * @param camera The Camera to render to.
      */
    def preRenderWebGL(renderer: CanvasRenderer, maskedObject: GameObject, camera: Camera): Unit = js.native
    def preRenderWebGL(renderer: WebGLRenderer, maskedObject: GameObject, camera: Camera): Unit = js.native
    
    /**
      * The previous framebuffer set in the renderer before this one was enabled.
      */
    var prevFramebuffer: WebGLFramebuffer = js.native
    
    /**
      * A reference to either the Canvas or WebGL Renderer that this Mask is using.
      */
    var renderer: CanvasRenderer | WebGLRenderer = js.native
    
    /**
      * Sets a new masking Game Object for the Bitmap Mask.
      * @param renderable A renderable Game Object that uses a texture, such as a Sprite.
      */
    def setBitmap(renderable: GameObject): Unit = js.native
  }
  
  /**
    * A Geometry Mask can be applied to a Game Object to hide any pixels of it which don't intersect
    * a visible pixel from the geometry mask. The mask is essentially a clipping path which can only
    * make a masked pixel fully visible or fully invisible without changing its alpha (opacity).
    * 
    * A Geometry Mask uses a Graphics Game Object to determine which pixels of the masked Game Object(s)
    * should be clipped. For any given point of a masked Game Object's texture, the pixel will only be displayed
    * if the Graphics Game Object of the Geometry Mask has a visible pixel at the same position. The color and
    * alpha of the pixel from the Geometry Mask do not matter.
    * 
    * The Geometry Mask's location matches the location of its Graphics object, not the location of the masked objects.
    * Moving or transforming the underlying Graphics object will change the mask (and affect the visibility
    * of any masked objects), whereas moving or transforming a masked object will not affect the mask.
    * You can think of the Geometry Mask (or rather, of its Graphics object) as an invisible curtain placed
    * in front of all masked objects which has its own visual properties and, naturally, respects the camera's
    * visual properties, but isn't affected by and doesn't follow the masked objects by itself.
    */
  @js.native
  trait GeometryMask extends js.Object {
    
    /**
      * Applies the current stencil mask to the renderer.
      * @param renderer The WebGL Renderer instance to draw to.
      * @param camera The camera the Game Object is being rendered through.
      * @param inc Is this an INCR stencil or a DECR stencil?
      */
    def applyStencil(renderer: WebGLRenderer, camera: Camera, inc: Boolean): Unit = js.native
    
    /**
      * Destroys this GeometryMask and nulls any references it holds.
      * 
      * Note that if a Game Object is currently using this mask it will _not_ automatically detect you have destroyed it,
      * so be sure to call `clearMask` on any Game Object using it, before destroying it.
      */
    def destroy(): Unit = js.native
    
    /**
      * The Graphics object which describes the Geometry Mask.
      */
    var geometryMask: Graphics = js.native
    
    /**
      * Similar to the BitmapMasks invertAlpha setting this to true will then hide all pixels
      * drawn to the Geometry Mask.
      */
    var invertAlpha: Boolean = js.native
    
    /**
      * Is this mask a stencil mask?
      */
    val isStencil: Boolean = js.native
    
    /**
      * Restore the canvas context's previous clipping path, thus turning off the mask for it.
      * @param renderer The Canvas Renderer instance being restored.
      */
    def postRenderCanvas(renderer: CanvasRenderer): Unit = js.native
    
    /**
      * Flushes all rendered pixels and disables the stencil test of a WebGL context, thus disabling the mask for it.
      * @param renderer The WebGL Renderer instance to draw flush.
      */
    def postRenderWebGL(renderer: WebGLRenderer): Unit = js.native
    
    /**
      * Sets the clipping path of a 2D canvas context to the Geometry Mask's underlying Graphics object.
      * @param renderer The Canvas Renderer instance to set the clipping path on.
      * @param mask The Game Object being rendered.
      * @param camera The camera the Game Object is being rendered through.
      */
    def preRenderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera): Unit = js.native
    
    /**
      * Renders the Geometry Mask's underlying Graphics object to the OpenGL stencil buffer and enables the stencil test, which clips rendered pixels according to the mask.
      * @param renderer The WebGL Renderer instance to draw to.
      * @param child The Game Object being rendered.
      * @param camera The camera the Game Object is being rendered through.
      */
    def preRenderWebGL(renderer: WebGLRenderer, child: GameObject, camera: Camera): Unit = js.native
    
    /**
      * Sets the `invertAlpha` property of this Geometry Mask.
      * Inverting the alpha essentially flips the way the mask works.
      * @param value Invert the alpha of this mask? Default true.
      */
    def setInvertAlpha(): this.type = js.native
    def setInvertAlpha(value: Boolean): this.type = js.native
    
    /**
      * Sets a new Graphics object for the Geometry Mask.
      * @param graphicsGeometry The Graphics object which will be used for the Geometry Mask.
      */
    def setShape(graphicsGeometry: Graphics): this.type = js.native
  }
}
