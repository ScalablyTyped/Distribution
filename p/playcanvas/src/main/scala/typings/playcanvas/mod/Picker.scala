package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Picker object used to select mesh instances from screen coordinates.
  *
  * @property {number} width Width of the pick buffer in pixels (read-only).
  * @property {number} height Height of the pick buffer in pixels (read-only).
  * @property {RenderTarget} renderTarget The render target used by the picker internally
  * (read-only).
  */
@JSImport("playcanvas", "Picker")
@js.native
open class Picker protected () extends StObject {
  /**
    * Create a new Picker instance.
    *
    * @param {AppBase} app - The application managing this picker instance.
    * @param {number} width - The width of the pick buffer in pixels.
    * @param {number} height - The height of the pick buffer in pixels.
    */
  def this(app: AppBase, width: Double, height: Double) = this()
  
  var _renderTarget: Any = js.native
  
  def allocateRenderTarget(): Unit = js.native
  
  var app: AppBase = js.native
  
  var cameraEntity: Entity = js.native
  
  var clearDepthCommand: Command = js.native
  
  var device: GraphicsDevice = js.native
  
  /**
    * Return the list of mesh instances selected by the specified rectangle in the previously
    * prepared pick buffer.The rectangle using top-left coordinate system.
    *
    * @param {number} x - The left edge of the rectangle.
    * @param {number} y - The top edge of the rectangle.
    * @param {number} [width] - The width of the rectangle.
    * @param {number} [height] - The height of the rectangle.
    * @returns {MeshInstance[]} An array of mesh instances that are in the selection.
    * @example
    * // Get the selection at the point (10,20)
    * var selection = picker.getSelection(10, 20);
    * @example
    * // Get all models in rectangle with corners at (10,20) and (20,40)
    * var selection = picker.getSelection(10, 20, 10, 20);
    */
  def getSelection(x: Double, y: Double): js.Array[MeshInstance] = js.native
  def getSelection(x: Double, y: Double, width: Double): js.Array[MeshInstance] = js.native
  def getSelection(x: Double, y: Double, width: Double, height: Double): js.Array[MeshInstance] = js.native
  def getSelection(x: Double, y: Double, width: Unit, height: Double): js.Array[MeshInstance] = js.native
  
  var height: Double = js.native
  
  def initLayerComposition(): Unit = js.native
  
  var layer: Layer = js.native
  
  var layerComp: LayerComposition = js.native
  
  var mapping: js.Array[Any] = js.native
  
  var pickColor: js.typedarray.Float32Array = js.native
  
  /**
    * Primes the pick buffer with a rendering of the specified models from the point of view of
    * the supplied camera. Once the pick buffer has been prepared, {@link Picker#getSelection} can
    * be called multiple times on the same picker object. Therefore, if the models or camera do
    * not change in any way, {@link Picker#prepare} does not need to be called again.
    *
    * @param {CameraComponent} camera - The camera component used to render the scene.
    * @param {Scene} scene - The scene containing the pickable mesh instances.
    * @param {Layer[]} [layers] - Layers from which objects will be picked. If not supplied, all layers of the specified camera will be used.
    */
  def prepare(camera: CameraComponent, scene: Scene_): Unit = js.native
  def prepare(camera: CameraComponent, scene: Scene_, layers: js.Array[Layer]): Unit = js.native
  
  def releaseRenderTarget(): Unit = js.native
  
  var renderTarget: RenderTarget = js.native
  
  /**
    * Sets the resolution of the pick buffer. The pick buffer resolution does not need to match
    * the resolution of the corresponding frame buffer use for general rendering of the 3D scene.
    * However, the lower the resolution of the pick buffer, the less accurate the selection
    * results returned by {@link Picker#getSelection}. On the other hand, smaller pick buffers
    * will yield greater performance, so there is a trade off.
    *
    * @param {number} width - The width of the pick buffer in pixels.
    * @param {number} height - The height of the pick buffer in pixels.
    */
  def resize(width: Double, height: Double): Unit = js.native
  
  def updateCamera(srcCamera: Any): Unit = js.native
  
  var width: Double = js.native
}
