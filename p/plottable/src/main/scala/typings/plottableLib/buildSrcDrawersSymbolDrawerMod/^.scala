package typings
package plottableLib.buildSrcDrawersSymbolDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/symbolDrawer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}

