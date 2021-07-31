package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterativeCalculationSettings extends StObject {
  
  /** When iterative calculation is enabled and successive results differ by less than this threshold value, the calculation rounds stop. */
  var convergenceThreshold: js.UndefOr[Double] = js.undefined
  
  /** When iterative calculation is enabled, the maximum number of calculation rounds to perform. */
  var maxIterations: js.UndefOr[Double] = js.undefined
}
object IterativeCalculationSettings {
  
  @scala.inline
  def apply(): IterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterativeCalculationSettings]
  }
  
  @scala.inline
  implicit class IterativeCalculationSettingsMutableBuilder[Self <: IterativeCalculationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvergenceThreshold(value: Double): Self = StObject.set(x, "convergenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvergenceThresholdUndefined: Self = StObject.set(x, "convergenceThreshold", js.undefined)
    
    @scala.inline
    def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
  }
}
