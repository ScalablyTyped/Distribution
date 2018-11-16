package typings
package plottableLib.buildSrcDrawersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers", JSImport.Namespace)
@js.native
object buildSrcDrawersModMembers extends js.Object {
  val ContextStyleAttrs: js.Array[java.lang.String] = js.native
  val RectangleCanvasDrawStep: plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def getStrokeDashArray(style: stdLib.Record[java.lang.String, _]): js.Array[scala.Double] = js.native
  def getStrokeWidth(style: stdLib.Record[java.lang.String, _]): scala.Double = js.native
  def makeAreaCanvasDrawStep(
    d3AreaFactory: js.Function0[d3DashShapeLib.d3DashShapeMod.Area[_]],
    d3LineFactory: js.Function0[d3DashShapeLib.d3DashShapeMod.Line[_]]
  ): plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[d3DashShapeLib.d3DashShapeMod.Line[_]]): plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    symbolProjector: js.Function0[
      plottableLib.buildSrcCoreInterfacesMod.IAccessor[plottableLib.buildSrcCoreSymbolFactoriesMod.SymbolFactory]
    ],
    sizeProjector: js.Function0[plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]]
  ): plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    symbolProjector: js.Function0[
      plottableLib.buildSrcCoreInterfacesMod.IAccessor[plottableLib.buildSrcCoreSymbolFactoriesMod.SymbolFactory]
    ],
    sizeProjector: js.Function0[plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]],
    stepBuffer: plottableLib.buildSrcDrawersCanvasBufferMod.CanvasBuffer
  ): plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def renderArea(
    context: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    d3Area: d3DashShapeLib.d3DashShapeMod.Area[_],
    data: js.Array[_],
    style: plottableLib.buildSrcDrawersCanvasDrawerMod.IFillStyle with plottableLib.buildSrcDrawersCanvasDrawerMod.IStrokeStyle
  ): scala.Unit = js.native
  def renderLine(
    context: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    d3Line: d3DashShapeLib.d3DashShapeMod.Line[_],
    data: js.Array[_],
    style: plottableLib.buildSrcDrawersCanvasDrawerMod.IStrokeStyle
  ): scala.Unit = js.native
  def renderPathWithStyle(
    context: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    style: stdLib.Record[java.lang.String, _]
  ): scala.Unit = js.native
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

