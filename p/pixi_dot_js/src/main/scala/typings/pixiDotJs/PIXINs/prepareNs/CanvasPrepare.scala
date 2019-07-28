package typings.pixiDotJs.PIXINs.prepareNs

import typings.pixiDotJs.PIXINs.CanvasRenderer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.prepare.CanvasPrepare")
@js.native
class CanvasPrepare protected () extends BasePrepare[CanvasPrepare] {
  def this(renderer: CanvasRenderer) = this()
  var canvas: HTMLCanvasElement = js.native
  var ctx: CanvasRenderingContext2D = js.native
}

