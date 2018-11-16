package typings
package pixiDotJsLib.PIXINs.prepareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.prepare.CanvasPrepare")
@js.native
class CanvasPrepare protected () extends BasePrepare[CanvasPrepare] {
  def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
  var canvas: stdLib.HTMLCanvasElement = js.native
  var ctx: stdLib.CanvasRenderingContext2D = js.native
}

