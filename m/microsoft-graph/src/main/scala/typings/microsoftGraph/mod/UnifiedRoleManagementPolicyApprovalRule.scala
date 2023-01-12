package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicyApprovalRule
  extends StObject
     with UnifiedRoleManagementPolicyRule {
  
  // The settings for approval of the role assignment.
  var setting: js.UndefOr[NullableOption[ApprovalSettings]] = js.undefined
}
object UnifiedRoleManagementPolicyApprovalRule {
  
  inline def apply(): UnifiedRoleManagementPolicyApprovalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicyApprovalRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleManagementPolicyApprovalRule] (val x: Self) extends AnyVal {
    
    inline def setSetting(value: NullableOption[ApprovalSettings]): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setSettingNull: Self = StObject.set(x, "setting", null)
    
    inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
  }
}
