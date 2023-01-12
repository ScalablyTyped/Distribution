package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalSetPolicyRequest extends StObject {
  
  /** Optional. Set the field as true when we would like to disable the onboarding notification. */
  var disableNotification: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The policy to be applied to the `resource`. */
  var policy: js.UndefOr[SasPortalPolicy] = js.undefined
  
  /** Required. The resource for which the policy is being specified. This policy replaces any existing policy. */
  var resource: js.UndefOr[String] = js.undefined
}
object SasPortalSetPolicyRequest {
  
  inline def apply(): SasPortalSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalSetPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalSetPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setDisableNotification(value: Boolean): Self = StObject.set(x, "disableNotification", value.asInstanceOf[js.Any])
    
    inline def setDisableNotificationUndefined: Self = StObject.set(x, "disableNotification", js.undefined)
    
    inline def setPolicy(value: SasPortalPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
