package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.SystemRenderer")
@js.native
class SystemRenderer protected ()
  extends pixiDotJsLib.PIXINs.utilsNs.EventEmitter {
  def this(system: java.lang.String) = this()
  def this(system: java.lang.String, options: RendererOptions) = this()
  def this(system: java.lang.String, screenWidth: scala.Double) = this()
  def this(system: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double) = this()
  def this(system: java.lang.String, screenWidth: scala.Double, screenHeight: scala.Double, options: RendererOptions) = this()
  var _backgroundColor: scala.Double = js.native
  var _backgroundColorRgba: js.Array[scala.Double] = js.native
  var _backgroundColorString: java.lang.String = js.native
  var _lastObjectRendered: DisplayObject = js.native
  var _tempDisplayObjectParent: Container = js.native
  var autoResize: scala.Boolean = js.native
  var backgroundColor: scala.Double = js.native
  var blendModes: js.Any = js.native
  var clearBeforeRender: scala.Boolean = js.native
  val height: scala.Double = js.native
  var options: RendererOptions = js.native
   // todo?
  var preserveDrawingBuffer: scala.Boolean = js.native
  var resolution: scala.Double = js.native
  var roundPixels: scala.Boolean = js.native
  var screen: Rectangle = js.native
  var transparent: scala.Boolean = js.native
  var `type`: scala.Double = js.native
  var view: stdLib.HTMLCanvasElement = js.native
  val width: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def destroy(removeView: scala.Boolean): scala.Unit = js.native
  def generateTexture(displayObject: DisplayObject): RenderTexture = js.native
  def generateTexture(displayObject: DisplayObject, scaleMode: scala.Double): RenderTexture = js.native
  def generateTexture(displayObject: DisplayObject, scaleMode: scala.Double, resolution: scala.Double): RenderTexture = js.native
  def generateTexture(displayObject: DisplayObject, scaleMode: scala.Double, resolution: scala.Double, region: Rectangle): RenderTexture = js.native
  def render(args: js.Any*): scala.Unit = js.native
  def resize(screenWidth: scala.Double, screenHeight: scala.Double): scala.Unit = js.native
}

