package typings.plottable.buildSrcDrawersCanvasDrawerMod

import typings.d3DashShape.d3DashShapeMod.Area
import typings.d3DashShape.d3DashShapeMod.Line
import typings.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import typings.std.CanvasRenderingContext2D
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/canvasDrawer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ContextStyleAttrs: js.Array[String] = js.native
  def getStrokeDashArray(style: Record[String, _]): js.Array[Double] = js.native
  def getStrokeWidth(style: Record[String, _]): Double = js.native
  def renderArea(
    context: CanvasRenderingContext2D,
    d3Area: Area[_],
    data: js.Array[_],
    style: IFillStyle with IStrokeStyle
  ): Unit = js.native
  def renderLine(context: CanvasRenderingContext2D, d3Line: Line[_], data: js.Array[_], style: IStrokeStyle): Unit = js.native
  def renderPathWithStyle(context: CanvasRenderingContext2D, style: Record[String, _]): Unit = js.native
  def resolveAttributes(projector: AttributeToAppliedProjector, attrKeys: js.Array[String], datum: js.Any, index: Double): Record[String, _] = js.native
  def resolveAttributesSubsetWithStyles(projector: AttributeToAppliedProjector, extraKeys: js.Array[String], datum: js.Any, index: Double): Record[String, _] = js.native
}

