package typings.plottable

import typings.plottable.canvasBufferMod.CanvasBuffer
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.svgDrawerMod.SVGDrawer
import typings.plottable.symbolFactoriesMod.SymbolFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolDrawerMod {
  
  @JSImport("plottable/build/src/drawers/symbolDrawer", "SymbolSVGDrawer")
  @js.native
  class SymbolSVGDrawer () extends SVGDrawer
  
  @JSImport("plottable/build/src/drawers/symbolDrawer", "makeSymbolCanvasDrawStep")
  @js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = js.native
  @JSImport("plottable/build/src/drawers/symbolDrawer", "makeSymbolCanvasDrawStep")
  @js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = js.native
}
