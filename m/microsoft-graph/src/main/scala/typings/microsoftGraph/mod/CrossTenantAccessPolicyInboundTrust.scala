package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantAccessPolicyInboundTrust extends StObject {
  
  // Specifies whether compliant devices from external Azure AD organizations are trusted.
  var isCompliantDeviceAccepted: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether hybrid Azure AD joined devices from external Azure AD organizations are trusted.
  var isHybridAzureADJoinedDeviceAccepted: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether MFA from external Azure AD organizations is trusted.
  var isMfaAccepted: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object CrossTenantAccessPolicyInboundTrust {
  
  inline def apply(): CrossTenantAccessPolicyInboundTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantAccessPolicyInboundTrust]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossTenantAccessPolicyInboundTrust] (val x: Self) extends AnyVal {
    
    inline def setIsCompliantDeviceAccepted(value: NullableOption[Boolean]): Self = StObject.set(x, "isCompliantDeviceAccepted", value.asInstanceOf[js.Any])
    
    inline def setIsCompliantDeviceAcceptedNull: Self = StObject.set(x, "isCompliantDeviceAccepted", null)
    
    inline def setIsCompliantDeviceAcceptedUndefined: Self = StObject.set(x, "isCompliantDeviceAccepted", js.undefined)
    
    inline def setIsHybridAzureADJoinedDeviceAccepted(value: NullableOption[Boolean]): Self = StObject.set(x, "isHybridAzureADJoinedDeviceAccepted", value.asInstanceOf[js.Any])
    
    inline def setIsHybridAzureADJoinedDeviceAcceptedNull: Self = StObject.set(x, "isHybridAzureADJoinedDeviceAccepted", null)
    
    inline def setIsHybridAzureADJoinedDeviceAcceptedUndefined: Self = StObject.set(x, "isHybridAzureADJoinedDeviceAccepted", js.undefined)
    
    inline def setIsMfaAccepted(value: NullableOption[Boolean]): Self = StObject.set(x, "isMfaAccepted", value.asInstanceOf[js.Any])
    
    inline def setIsMfaAcceptedNull: Self = StObject.set(x, "isMfaAccepted", null)
    
    inline def setIsMfaAcceptedUndefined: Self = StObject.set(x, "isMfaAccepted", js.undefined)
  }
}
