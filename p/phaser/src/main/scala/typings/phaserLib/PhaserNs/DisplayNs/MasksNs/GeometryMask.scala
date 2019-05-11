package typings
package phaserLib.PhaserNs.DisplayNs.MasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("Phaser.Display.Masks.GeometryMask")
@js.native
class GeometryMask protected () extends js.Object {
  /**
    * 
    * @param scene This parameter is not used.
    * @param graphicsGeometry The Graphics Game Object to use for the Geometry Mask. Doesn't have to be in the Display List.
    */
  def this(scene: phaserLib.PhaserNs.Scene, graphicsGeometry: phaserLib.PhaserNs.GameObjectsNs.Graphics) = this()
  /**
    * The Graphics object which describes the Geometry Mask.
    */
  var geometryMask: phaserLib.PhaserNs.GameObjectsNs.Graphics = js.native
  /**
    * Similar to the BitmapMasks invertAlpha setting this to true will then hide all pixels
    * drawn to the Geometry Mask.
    */
  var invertAlpha: scala.Boolean = js.native
  /**
    * Is this mask a stencil mask?
    */
  val isStencil: scala.Boolean = js.native
  /**
    * Applies the current stencil mask to the renderer.
    * @param renderer The WebGL Renderer instance to draw to.
    * @param camera The camera the Game Object is being rendered through.
    * @param inc Is this an INCR stencil or a DECR stencil?
    */
  def applyStencil(
    renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera,
    inc: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Destroys this GeometryMask and nulls any references it holds.
    * 
    * Note that if a Game Object is currently using this mask it will _not_ automatically detect you have destroyed it,
    * so be sure to call `clearMask` on any Game Object using it, before destroying it.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Restore the canvas context's previous clipping path, thus turning off the mask for it.
    * @param renderer The Canvas Renderer instance being restored.
    */
  def postRenderCanvas(renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer): scala.Unit = js.native
  /**
    * Flushes all rendered pixels and disables the stencil test of a WebGL context, thus disabling the mask for it.
    * @param renderer The WebGL Renderer instance to draw flush.
    */
  def postRenderWebGL(renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer): scala.Unit = js.native
  /**
    * Sets the clipping path of a 2D canvas context to the Geometry Mask's underlying Graphics object.
    * @param renderer The Canvas Renderer instance to set the clipping path on.
    * @param mask The Game Object being rendered.
    * @param camera The camera the Game Object is being rendered through.
    */
  def preRenderCanvas(
    renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer,
    mask: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Unit = js.native
  /**
    * Renders the Geometry Mask's underlying Graphics object to the OpenGL stencil buffer and enables the stencil test, which clips rendered pixels according to the mask.
    * @param renderer The WebGL Renderer instance to draw to.
    * @param child The Game Object being rendered.
    * @param camera The camera the Game Object is being rendered through.
    */
  def preRenderWebGL(
    renderer: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer,
    child: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Unit = js.native
  /**
    * Sets the `invertAlpha` property of this Geometry Mask.
    * Inverting the alpha essentially flips the way the mask works.
    * @param value Invert the alpha of this mask? Default true.
    */
  def setInvertAlpha(): this.type = js.native
  def setInvertAlpha(value: scala.Boolean): this.type = js.native
  /**
    * Sets a new Graphics object for the Geometry Mask.
    * @param graphicsGeometry The Graphics object which will be used for the Geometry Mask.
    */
  def setShape(graphicsGeometry: phaserLib.PhaserNs.GameObjectsNs.Graphics): this.type = js.native
}

