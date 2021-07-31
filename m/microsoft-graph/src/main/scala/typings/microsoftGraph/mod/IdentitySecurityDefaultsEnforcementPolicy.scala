package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitySecurityDefaultsEnforcementPolicy
  extends StObject
     with PolicyBase {
  
  // If set to true, Azure Active Directory security defaults is enabled for the tenant.
  var isEnabled: js.UndefOr[Boolean] = js.undefined
}
object IdentitySecurityDefaultsEnforcementPolicy {
  
  @scala.inline
  def apply(): IdentitySecurityDefaultsEnforcementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitySecurityDefaultsEnforcementPolicy]
  }
  
  @scala.inline
  implicit class IdentitySecurityDefaultsEnforcementPolicyMutableBuilder[Self <: IdentitySecurityDefaultsEnforcementPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
  }
}
