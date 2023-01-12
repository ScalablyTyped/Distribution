package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicyEnablementRule
  extends StObject
     with UnifiedRoleManagementPolicyRule {
  
  /**
    * The collection of rules that are enabled for this policy rule. For example, MultiFactorAuthentication, Ticketing, and
    * Justification.
    */
  var enabledRules: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object UnifiedRoleManagementPolicyEnablementRule {
  
  inline def apply(): UnifiedRoleManagementPolicyEnablementRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicyEnablementRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleManagementPolicyEnablementRule] (val x: Self) extends AnyVal {
    
    inline def setEnabledRules(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "enabledRules", value.asInstanceOf[js.Any])
    
    inline def setEnabledRulesNull: Self = StObject.set(x, "enabledRules", null)
    
    inline def setEnabledRulesUndefined: Self = StObject.set(x, "enabledRules", js.undefined)
    
    inline def setEnabledRulesVarargs(value: String*): Self = StObject.set(x, "enabledRules", js.Array(value*))
  }
}
