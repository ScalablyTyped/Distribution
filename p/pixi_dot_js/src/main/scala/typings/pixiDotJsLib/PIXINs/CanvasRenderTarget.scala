package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.CanvasRenderTarget")
@js.native
class CanvasRenderTarget protected () extends js.Object {
  def this(width: scala.Double, height: scala.Double, resolution: scala.Double) = this()
  var canvas: stdLib.HTMLCanvasElement = js.native
  var context: stdLib.CanvasRenderingContext2D = js.native
  var height: scala.Double = js.native
  var resolution: scala.Double = js.native
  var width: scala.Double = js.native
  def clear(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

