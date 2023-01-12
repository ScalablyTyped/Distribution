package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicyAuthenticationContextRule
  extends StObject
     with UnifiedRoleManagementPolicyRule {
  
  // The value of the authentication context claim.
  var claimValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether this rule is enabled.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object UnifiedRoleManagementPolicyAuthenticationContextRule {
  
  inline def apply(): UnifiedRoleManagementPolicyAuthenticationContextRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicyAuthenticationContextRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleManagementPolicyAuthenticationContextRule] (val x: Self) extends AnyVal {
    
    inline def setClaimValue(value: NullableOption[String]): Self = StObject.set(x, "claimValue", value.asInstanceOf[js.Any])
    
    inline def setClaimValueNull: Self = StObject.set(x, "claimValue", null)
    
    inline def setClaimValueUndefined: Self = StObject.set(x, "claimValue", js.undefined)
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
  }
}
