package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceComplianceScheduledActionForRule
  extends StObject
     with Entity {
  
  // Name of the rule which this scheduled action applies to.
  var ruleName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of scheduled action configurations for this compliance policy.
  var scheduledActionConfigurations: js.UndefOr[NullableOption[js.Array[DeviceComplianceActionItem]]] = js.undefined
}
object DeviceComplianceScheduledActionForRule {
  
  inline def apply(): DeviceComplianceScheduledActionForRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceScheduledActionForRule]
  }
  
  extension [Self <: DeviceComplianceScheduledActionForRule](x: Self) {
    
    inline def setRuleName(value: NullableOption[String]): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameNull: Self = StObject.set(x, "ruleName", null)
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
    
    inline def setScheduledActionConfigurations(value: NullableOption[js.Array[DeviceComplianceActionItem]]): Self = StObject.set(x, "scheduledActionConfigurations", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionConfigurationsNull: Self = StObject.set(x, "scheduledActionConfigurations", null)
    
    inline def setScheduledActionConfigurationsUndefined: Self = StObject.set(x, "scheduledActionConfigurations", js.undefined)
    
    inline def setScheduledActionConfigurationsVarargs(value: DeviceComplianceActionItem*): Self = StObject.set(x, "scheduledActionConfigurations", js.Array(value :_*))
  }
}
