package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageRule
  extends StObject
     with Entity {
  
  // Actions to be taken on a message when the corresponding conditions are fulfilled.
  var actions: js.UndefOr[NullableOption[MessageRuleActions]] = js.undefined
  
  // Conditions that when fulfilled, will trigger the corresponding actions for that rule.
  var conditions: js.UndefOr[NullableOption[MessageRulePredicates]] = js.undefined
  
  // The display name of the rule.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Exception conditions for the rule.
  var exceptions: js.UndefOr[NullableOption[MessageRulePredicates]] = js.undefined
  
  // Indicates whether the rule is in an error condition. Read-only.
  var hasError: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the rule is enabled to be applied to messages.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
  var isReadOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates the order in which the rule is executed, among other rules.
  var sequence: js.UndefOr[NullableOption[Double]] = js.undefined
}
object MessageRule {
  
  @scala.inline
  def apply(): MessageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRule]
  }
  
  @scala.inline
  implicit class MessageRuleMutableBuilder[Self <: MessageRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: NullableOption[MessageRuleActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsNull: Self = StObject.set(x, "actions", null)
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setConditions(value: NullableOption[MessageRulePredicates]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsNull: Self = StObject.set(x, "conditions", null)
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExceptions(value: NullableOption[MessageRulePredicates]): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionsNull: Self = StObject.set(x, "exceptions", null)
    
    @scala.inline
    def setExceptionsUndefined: Self = StObject.set(x, "exceptions", js.undefined)
    
    @scala.inline
    def setHasError(value: NullableOption[Boolean]): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasErrorNull: Self = StObject.set(x, "hasError", null)
    
    @scala.inline
    def setHasErrorUndefined: Self = StObject.set(x, "hasError", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setIsReadOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnlyNull: Self = StObject.set(x, "isReadOnly", null)
    
    @scala.inline
    def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
    
    @scala.inline
    def setSequence(value: NullableOption[Double]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNull: Self = StObject.set(x, "sequence", null)
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
  }
}
