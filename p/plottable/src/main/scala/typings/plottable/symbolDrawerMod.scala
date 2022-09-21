package typings.plottable

import typings.plottable.canvasBufferMod.CanvasBuffer
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.svgDrawerMod.SVGDrawer
import typings.plottable.symbolFactoriesMod.SymbolFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolDrawerMod {
  
  @JSImport("plottable/build/src/drawers/symbolDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/drawers/symbolDrawer", "SymbolSVGDrawer")
  @js.native
  open class SymbolSVGDrawer () extends SVGDrawer
  
  inline def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolCanvasDrawStep")(dataset.asInstanceOf[js.Any], symbolProjector.asInstanceOf[js.Any], sizeProjector.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
  inline def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolCanvasDrawStep")(dataset.asInstanceOf[js.Any], symbolProjector.asInstanceOf[js.Any], sizeProjector.asInstanceOf[js.Any], stepBuffer.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
}
