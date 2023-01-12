package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicyRule
  extends StObject
     with Entity {
  
  /**
    * Defines details of scope that's targeted by role management policy rule. The details can include the principal type,
    * the role assignment type, and actions affecting a role. Supports $filter (eq, ne).
    */
  var target: js.UndefOr[NullableOption[UnifiedRoleManagementPolicyRuleTarget]] = js.undefined
}
object UnifiedRoleManagementPolicyRule {
  
  inline def apply(): UnifiedRoleManagementPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicyRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleManagementPolicyRule] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: NullableOption[UnifiedRoleManagementPolicyRuleTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
