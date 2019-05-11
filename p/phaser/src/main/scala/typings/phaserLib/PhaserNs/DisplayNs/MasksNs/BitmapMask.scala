package typings
package phaserLib.PhaserNs.DisplayNs.MasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("Phaser.Display.Masks.BitmapMask")
@js.native
class BitmapMask protected () extends js.Object {
  /**
    * 
    * @param scene The Scene which this Bitmap Mask will be used in.
    * @param renderable A renderable Game Object that uses a texture, such as a Sprite.
    */
  def this(scene: phaserLib.PhaserNs.Scene, renderable: phaserLib.PhaserNs.GameObjectsNs.GameObject) = this()
  /**
    * A renderable Game Object that uses a texture, such as a Sprite.
    */
  var bitmapMask: phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Whether the Bitmap Mask is dirty and needs to be updated.
    */
  var dirty: scala.Boolean = js.native
  /**
    * Whether to invert the masks alpha.
    * 
    * If `true`, the alpha of the masking pixel will be inverted before it's multiplied with the masked pixel. Essentially, this means that a masked area will be visible only if the corresponding area in the mask is invisible.
    */
  var invertAlpha: scala.Boolean = js.native
  /**
    * Is this mask a stencil mask?
    */
  val isStencil: scala.Boolean = js.native
  /**
    * The framebuffer to which a masked Game Object is rendered.
    */
  var mainFramebuffer: stdLib.WebGLFramebuffer = js.native
  /**
    * The texture used for the main framebuffer.
    */
  var mainTexture: stdLib.WebGLTexture = js.native
  /**
    * The framebuffer to which the Bitmap Mask's masking Game Object is rendered.
    */
  var maskFramebuffer: stdLib.WebGLFramebuffer = js.native
  /**
    * The texture used for the mask's framebuffer.
    */
  var maskTexture: stdLib.WebGLTexture = js.native
  /**
    * The previous framebuffer set in the renderer before this one was enabled.
    */
  var prevFramebuffer: stdLib.WebGLFramebuffer = js.native
  /**
    * A reference to either the Canvas or WebGL Renderer that this Mask is using.
    */
  var renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer | phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer = js.native
  /**
    * Destroys this BitmapMask and nulls any references it holds.
    * 
    * Note that if a Game Object is currently using this mask it will _not_ automatically detect you have destroyed it,
    * so be sure to call `clearMask` on any Game Object using it, before destroying it.
    */
  def destroy(): scala.Unit = js.native
  /**
    * This is a NOOP method. Bitmap Masks are not supported by the Canvas Renderer.
    * @param renderer The Canvas Renderer which would be rendered to.
    */
  def postRenderCanvas(renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer): scala.Unit = js.native
  def postRenderCanvas(renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer): scala.Unit = js.native
  /**
    * Finalizes rendering of a masked Game Object.
    * 
    * This resets the previously bound framebuffer and switches the WebGL Renderer to the Bitmap Mask Pipeline, which uses a special fragment shader to apply the masking effect.
    * @param renderer The WebGL Renderer to clean up.
    */
  def postRenderWebGL(renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer): scala.Unit = js.native
  def postRenderWebGL(renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer): scala.Unit = js.native
  /**
    * This is a NOOP method. Bitmap Masks are not supported by the Canvas Renderer.
    * @param renderer The Canvas Renderer which would be rendered to.
    * @param mask The masked Game Object which would be rendered.
    * @param camera The Camera to render to.
    */
  def preRenderCanvas(
    renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer,
    mask: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Unit = js.native
  def preRenderCanvas(
    renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer,
    mask: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Unit = js.native
  /**
    * Prepares the WebGL Renderer to render a Game Object with this mask applied.
    * 
    * This renders the masking Game Object to the mask framebuffer and switches to the main framebuffer so that the masked Game Object will be rendered to it instead of being rendered directly to the frame.
    * @param renderer The WebGL Renderer to prepare.
    * @param maskedObject The masked Game Object which will be drawn.
    * @param camera The Camera to render to.
    */
  def preRenderWebGL(
    renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer,
    maskedObject: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Unit = js.native
  def preRenderWebGL(
    renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer,
    maskedObject: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Unit = js.native
  /**
    * Sets a new masking Game Object for the Bitmap Mask.
    * @param renderable A renderable Game Object that uses a texture, such as a Sprite.
    */
  def setBitmap(renderable: phaserLib.PhaserNs.GameObjectsNs.GameObject): scala.Unit = js.native
}

