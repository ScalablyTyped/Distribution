package typings
package plottableLib.buildSrcDrawersCanvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/canvasDrawer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ContextStyleAttrs: js.Array[java.lang.String] = js.native
  def getStrokeDashArray(style: stdLib.Record[java.lang.String, _]): js.Array[scala.Double] = js.native
  def getStrokeWidth(style: stdLib.Record[java.lang.String, _]): scala.Double = js.native
  def renderArea(
    context: stdLib.CanvasRenderingContext2D,
    d3Area: d3DashShapeLib.d3DashShapeMod.Area[_],
    data: js.Array[_],
    style: IFillStyle with IStrokeStyle
  ): scala.Unit = js.native
  def renderLine(
    context: stdLib.CanvasRenderingContext2D,
    d3Line: d3DashShapeLib.d3DashShapeMod.Line[_],
    data: js.Array[_],
    style: IStrokeStyle
  ): scala.Unit = js.native
  def renderPathWithStyle(context: stdLib.CanvasRenderingContext2D, style: stdLib.Record[java.lang.String, _]): scala.Unit = js.native
  def resolveAttributes(
    projector: plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector,
    attrKeys: js.Array[java.lang.String],
    datum: js.Any,
    index: scala.Double
  ): stdLib.Record[java.lang.String, _] = js.native
  def resolveAttributesSubsetWithStyles(
    projector: plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector,
    extraKeys: js.Array[java.lang.String],
    datum: js.Any,
    index: scala.Double
  ): stdLib.Record[java.lang.String, _] = js.native
}

