package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Plot")
@js.native
/**
  * A Plot draws some visualization of the inputted Datasets.
  *
  * @constructor
  */
class Plot ()
  extends plottableLib.buildSrcPlotsPlotMod.Plot

/* static members */
@JSImport("plottable", "Plot")
@js.native
object Plot extends js.Object {
  var OPTIMIZE_MEMOIZE_PROJECTORS: scala.Boolean = js.native
  var _ANIMATION_MAX_DURATION: scala.Double = js.native
  /* protected */ def _scaledAccessor[D, R](binding: plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[D, R]): plottableLib.buildSrcCoreInterfacesMod.IAccessor[_] = js.native
  def applyDrawSteps(
    drawSteps: js.Array[plottableLib.buildSrcDrawersDrawStepMod.DrawStep],
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset
  ): js.Array[plottableLib.buildSrcDrawersDrawStepMod.AppliedDrawStep] = js.native
  def getTotalDrawTime(data: js.Array[_], drawSteps: js.Array[plottableLib.buildSrcDrawersDrawStepMod.DrawStep]): scala.Double = js.native
}

