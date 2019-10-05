package typings.plottable.buildSrcDrawersCanvasDrawerMod

import typings.d3DashShape.d3DashShapeMod.Area
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/canvasDrawer", "renderArea")
@js.native
object renderArea extends js.Object {
  def apply(
    context: CanvasRenderingContext2D,
    d3Area: Area[_],
    data: js.Array[_],
    style: IFillStyle with IStrokeStyle
  ): Unit = js.native
}

