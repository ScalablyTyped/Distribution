package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new instance of a Picker object.
  * @property width - Width of the pick buffer in pixels (read-only).
  * @property height - Height of the pick buffer in pixels (read-only).
  * @property renderTarget - The render target used by the picker internally (read-only).
  * @param app - The application managing this picker instance.
  * @param width - The width of the pick buffer in pixels.
  * @param height - The height of the pick buffer in pixels.
  */
@js.native
trait Picker extends js.Object {
  
  /**
    * Return the list of mesh instances selected by the specified rectangle in the
    previously prepared pick buffer.The rectangle using top-left coordinate system.
    * @example
    * // Get the selection at the point (10,20)
    var selection = picker.getSelection(10, 20);
    * @example
    * // Get all models in rectangle with corners at (10,20) and (20,40)
    var selection = picker.getSelection(10, 20, 10, 20);
    * @param x - The left edge of the rectangle.
    * @param y - The top edge of the rectangle.
    * @param [width] - The width of the rectangle.
    * @param [height] - The height of the rectangle.
    * @returns An array of mesh instances that are in the selection.
    */
  def getSelection(x: Double, y: Double): js.Array[MeshInstance] = js.native
  def getSelection(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): js.Array[MeshInstance] = js.native
  def getSelection(x: Double, y: Double, width: Double): js.Array[MeshInstance] = js.native
  def getSelection(x: Double, y: Double, width: Double, height: Double): js.Array[MeshInstance] = js.native
  
  /**
    * Height of the pick buffer in pixels (read-only).
    */
  var height: Double = js.native
  
  /**
    * Primes the pick buffer with a rendering of the specified models from the point of view
    of the supplied camera. Once the pick buffer has been prepared, pc.Picker#getSelection can be
    called multiple times on the same picker object. Therefore, if the models or camera do not change
    in any way, pc.Picker#prepare does not need to be called again.
    * @param camera - The camera component used to render the scene.
    * @param scene - The scene containing the pickable mesh instances.
    * @param [arg] - Layer or RenderTarget from which objects will be picked.
    If not supplied, all layers rendering to backbuffer before this layer will be used.
    */
  def prepare(camera: CameraComponent, scene: Scene): Unit = js.native
  def prepare(camera: CameraComponent, scene: Scene, arg: Layer): Unit = js.native
  def prepare(camera: CameraComponent, scene: Scene, arg: RenderTarget): Unit = js.native
  
  /**
    * The render target used by the picker internally (read-only).
    */
  var renderTarget: RenderTarget = js.native
  
  /**
    * Sets the resolution of the pick buffer. The pick buffer resolution does not need
    to match the resolution of the corresponding frame buffer use for general rendering of the
    3D scene. However, the lower the resolution of the pick buffer, the less accurate the selection
    results returned by pc.Picker#getSelection. On the other hand, smaller pick buffers will
    yield greater performance, so there is a trade off.
    * @param width - The width of the pick buffer in pixels.
    * @param height - The height of the pick buffer in pixels.
    */
  def resize(width: Double, height: Double): Unit = js.native
  
  /**
    * Width of the pick buffer in pixels (read-only).
    */
  var width: Double = js.native
}
