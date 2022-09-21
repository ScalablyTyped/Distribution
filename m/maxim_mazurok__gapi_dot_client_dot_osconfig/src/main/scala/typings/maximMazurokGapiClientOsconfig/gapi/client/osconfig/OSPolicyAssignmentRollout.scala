package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyAssignmentRollout extends StObject {
  
  /** Required. The maximum number (or percentage) of VMs per zone to disrupt at any given moment. */
  var disruptionBudget: js.UndefOr[FixedOrPercent] = js.undefined
  
  /**
    * Required. This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the
    * `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
    */
  var minWaitDuration: js.UndefOr[String] = js.undefined
}
object OSPolicyAssignmentRollout {
  
  inline def apply(): OSPolicyAssignmentRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyAssignmentRollout]
  }
  
  extension [Self <: OSPolicyAssignmentRollout](x: Self) {
    
    inline def setDisruptionBudget(value: FixedOrPercent): Self = StObject.set(x, "disruptionBudget", value.asInstanceOf[js.Any])
    
    inline def setDisruptionBudgetUndefined: Self = StObject.set(x, "disruptionBudget", js.undefined)
    
    inline def setMinWaitDuration(value: String): Self = StObject.set(x, "minWaitDuration", value.asInstanceOf[js.Any])
    
    inline def setMinWaitDurationUndefined: Self = StObject.set(x, "minWaitDuration", js.undefined)
  }
}
