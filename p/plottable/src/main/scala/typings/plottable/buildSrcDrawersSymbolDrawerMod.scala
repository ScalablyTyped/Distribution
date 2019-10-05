package typings.plottable

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcCoreSymbolFactoriesMod.SymbolFactory
import typings.plottable.buildSrcDrawersCanvasBufferMod.CanvasBuffer
import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typings.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/symbolDrawer", JSImport.Namespace)
@js.native
object buildSrcDrawersSymbolDrawerMod extends js.Object {
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

