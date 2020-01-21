package typings.plottable.mod

import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.drawStepMod.AppliedDrawStep
import typings.plottable.drawStepMod.DrawStep
import typings.plottable.interfacesMod.IAccessor
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
  extends typings.plottable.plotMod.Plot

/* static members */
@JSImport("plottable", "Plot")
@js.native
object Plot extends js.Object {
  var OPTIMIZE_MEMOIZE_PROJECTORS: Boolean = js.native
  var _ANIMATION_MAX_DURATION: Double = js.native
  /* protected */ def _scaledAccessor[D, R](binding: IAccessorScaleBinding[D, R]): IAccessor[_] = js.native
  def applyDrawSteps(drawSteps: js.Array[DrawStep], dataset: typings.plottable.datasetMod.Dataset): js.Array[AppliedDrawStep] = js.native
  def getTotalDrawTime(data: js.Array[_], drawSteps: js.Array[DrawStep]): Double = js.native
}

