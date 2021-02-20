package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalSetPolicyRequest extends StObject {
  
  /** Required. The policy to be applied to the `resource`. */
  var policy: js.UndefOr[SasPortalPolicy] = js.native
  
  /** Required. The resource for which the policy is being specified. This policy replaces any existing policy. */
  var resource: js.UndefOr[String] = js.native
}
object SasPortalSetPolicyRequest {
  
  @scala.inline
  def apply(): SasPortalSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalSetPolicyRequest]
  }
  
  @scala.inline
  implicit class SasPortalSetPolicyRequestMutableBuilder[Self <: SasPortalSetPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: SasPortalPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
