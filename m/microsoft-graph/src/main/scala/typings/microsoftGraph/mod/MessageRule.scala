package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageRule extends Entity {
  
  // Actions to be taken on a message when the corresponding conditions are fulfilled.
  var actions: js.UndefOr[NullableOption[MessageRuleActions]] = js.native
  
  // Conditions that when fulfilled, will trigger the corresponding actions for that rule.
  var conditions: js.UndefOr[NullableOption[MessageRulePredicates]] = js.native
  
  // The display name of the rule.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Exception conditions for the rule.
  var exceptions: js.UndefOr[NullableOption[MessageRulePredicates]] = js.native
  
  // Indicates whether the rule is in an error condition. Read-only.
  var hasError: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether the rule is enabled to be applied to messages.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
  var isReadOnly: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates the order in which the rule is executed, among other rules.
  var sequence: js.UndefOr[NullableOption[Double]] = js.native
}
object MessageRule {
  
  @scala.inline
  def apply(): MessageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRule]
  }
  
  @scala.inline
  implicit class MessageRuleOps[Self <: MessageRule] (val x: Self) extends AnyVal {
    
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
    def setActions(value: NullableOption[MessageRuleActions]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setActionsNull: Self = this.set("actions", null)
    
    @scala.inline
    def setConditions(value: NullableOption[MessageRulePredicates]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setConditionsNull: Self = this.set("conditions", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setExceptions(value: NullableOption[MessageRulePredicates]): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptions: Self = this.set("exceptions", js.undefined)
    
    @scala.inline
    def setExceptionsNull: Self = this.set("exceptions", null)
    
    @scala.inline
    def setHasError(value: NullableOption[Boolean]): Self = this.set("hasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasError: Self = this.set("hasError", js.undefined)
    
    @scala.inline
    def setHasErrorNull: Self = this.set("hasError", null)
    
    @scala.inline
    def setIsEnabled(value: NullableOption[Boolean]): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setIsEnabledNull: Self = this.set("isEnabled", null)
    
    @scala.inline
    def setIsReadOnly(value: NullableOption[Boolean]): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReadOnly: Self = this.set("isReadOnly", js.undefined)
    
    @scala.inline
    def setIsReadOnlyNull: Self = this.set("isReadOnly", null)
    
    @scala.inline
    def setSequence(value: NullableOption[Double]): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSequenceNull: Self = this.set("sequence", null)
  }
}
