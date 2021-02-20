package typings.plottable.mod

import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.drawStepMod.AppliedDrawStep
import typings.plottable.drawStepMod.DrawStep
import typings.plottable.interfacesMod.IAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Plot {
  
  @JSImport("plottable", "Plot")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable", "Plot.OPTIMIZE_MEMOIZE_PROJECTORS")
  @js.native
  def OPTIMIZE_MEMOIZE_PROJECTORS: Boolean = js.native
  @scala.inline
  def OPTIMIZE_MEMOIZE_PROJECTORS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTIMIZE_MEMOIZE_PROJECTORS")(x.asInstanceOf[js.Any])
  
  @JSImport("plottable", "Plot._ANIMATION_MAX_DURATION")
  @js.native
  def _ANIMATION_MAX_DURATION: Double = js.native
  @scala.inline
  def _ANIMATION_MAX_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ANIMATION_MAX_DURATION")(x.asInstanceOf[js.Any])
  
  @JSImport("plottable", "Plot._scaledAccessor")
  @js.native
  def _scaledAccessor[D, R](binding: IAccessorScaleBinding[D, R]): IAccessor[_] = js.native
  
  @JSImport("plottable", "Plot.applyDrawSteps")
  @js.native
  def applyDrawSteps(drawSteps: js.Array[DrawStep], dataset: typings.plottable.datasetMod.Dataset): js.Array[AppliedDrawStep] = js.native
  
  @JSImport("plottable", "Plot.getTotalDrawTime")
  @js.native
  def getTotalDrawTime(data: js.Array[_], drawSteps: js.Array[DrawStep]): Double = js.native
}
