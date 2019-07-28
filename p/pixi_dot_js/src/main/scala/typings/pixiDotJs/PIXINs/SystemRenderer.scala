package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.utilsNs.EventEmitter
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.SystemRenderer")
@js.native
class SystemRenderer protected () extends EventEmitter {
  def this(system: String) = this()
  def this(system: String, options: RendererOptions) = this()
  def this(system: String, screenWidth: Double) = this()
  def this(system: String, screenWidth: Double, screenHeight: Double) = this()
  def this(system: String, screenWidth: Double, screenHeight: Double, options: RendererOptions) = this()
  var _backgroundColor: Double = js.native
  var _backgroundColorRgba: js.Array[Double] = js.native
  var _backgroundColorString: String = js.native
  var _lastObjectRendered: DisplayObject = js.native
  var _tempDisplayObjectParent: Container = js.native
  var autoResize: Boolean = js.native
  var backgroundColor: Double = js.native
  var blendModes: js.Any = js.native
  var clearBeforeRender: Boolean = js.native
  val height: Double = js.native
  var options: RendererOptions = js.native
   // todo?
  var preserveDrawingBuffer: Boolean = js.native
  var resolution: Double = js.native
  var roundPixels: Boolean = js.native
  var screen: Rectangle = js.native
  var transparent: Boolean = js.native
  var `type`: Double = js.native
  var view: HTMLCanvasElement = js.native
  val width: Double = js.native
  def destroy(): Unit = js.native
  def destroy(removeView: Boolean): Unit = js.native
  def generateTexture(displayObject: DisplayObject): RenderTexture = js.native
  def generateTexture(displayObject: DisplayObject, scaleMode: Double): RenderTexture = js.native
  def generateTexture(displayObject: DisplayObject, scaleMode: Double, resolution: Double): RenderTexture = js.native
  def generateTexture(displayObject: DisplayObject, scaleMode: Double, resolution: Double, region: Rectangle): RenderTexture = js.native
  def render(args: js.Any*): Unit = js.native
  def resize(screenWidth: Double, screenHeight: Double): Unit = js.native
}

