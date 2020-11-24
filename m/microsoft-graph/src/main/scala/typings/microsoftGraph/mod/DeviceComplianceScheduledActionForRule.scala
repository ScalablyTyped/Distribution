package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceComplianceScheduledActionForRule extends Entity {
  
  // Name of the rule which this scheduled action applies to.
  var ruleName: js.UndefOr[NullableOption[String]] = js.native
  
  // The list of scheduled action configurations for this compliance policy.
  var scheduledActionConfigurations: js.UndefOr[NullableOption[js.Array[DeviceComplianceActionItem]]] = js.native
}
object DeviceComplianceScheduledActionForRule {
  
  @scala.inline
  def apply(): DeviceComplianceScheduledActionForRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceScheduledActionForRule]
  }
  
  @scala.inline
  implicit class DeviceComplianceScheduledActionForRuleOps[Self <: DeviceComplianceScheduledActionForRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRuleName(value: NullableOption[String]): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleName: Self = this.set("ruleName", js.undefined)
    
    @scala.inline
    def setRuleNameNull: Self = this.set("ruleName", null)
    
    @scala.inline
    def setScheduledActionConfigurationsVarargs(value: DeviceComplianceActionItem*): Self = this.set("scheduledActionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setScheduledActionConfigurations(value: NullableOption[js.Array[DeviceComplianceActionItem]]): Self = this.set("scheduledActionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActionConfigurations: Self = this.set("scheduledActionConfigurations", js.undefined)
    
    @scala.inline
    def setScheduledActionConfigurationsNull: Self = this.set("scheduledActionConfigurations", null)
  }
}
