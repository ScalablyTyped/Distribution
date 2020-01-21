package typings.plottable

import typings.plottable.canvasBufferMod.CanvasBuffer
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.svgDrawerMod.SVGDrawer
import typings.plottable.symbolFactoriesMod.SymbolFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/symbolDrawer", JSImport.Namespace)
@js.native
object symbolDrawerMod extends js.Object {
  @js.native
  class SymbolSVGDrawer () extends SVGDrawer
  
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
}

