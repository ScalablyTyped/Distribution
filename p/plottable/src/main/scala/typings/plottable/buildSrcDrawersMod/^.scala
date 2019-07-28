package typings.plottable.buildSrcDrawersMod

import typings.d3DashShape.d3DashShapeMod.Area
import typings.d3DashShape.d3DashShapeMod.Line
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcCoreSymbolFactoriesMod.SymbolFactory
import typings.plottable.buildSrcDrawersCanvasBufferMod.CanvasBuffer
import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typings.plottable.buildSrcDrawersCanvasDrawerMod.IFillStyle
import typings.plottable.buildSrcDrawersCanvasDrawerMod.IStrokeStyle
import typings.std.CanvasRenderingContext2D
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ContextStyleAttrs: js.Array[String] = js.native
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  def getStrokeDashArray(style: Record[String, _]): js.Array[Double] = js.native
  def getStrokeWidth(style: Record[String, _]): Double = js.native
  def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area[_]], d3LineFactory: js.Function0[Line[_]]): CanvasDrawStep = js.native
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line[_]]): CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = js.native
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

