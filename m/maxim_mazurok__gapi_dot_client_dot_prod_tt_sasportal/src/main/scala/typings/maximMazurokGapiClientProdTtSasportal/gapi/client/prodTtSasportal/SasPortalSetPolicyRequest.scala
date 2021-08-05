package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalSetPolicyRequest extends StObject {
  
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
  
  extension [Self <: SasPortalSetPolicyRequest](x: Self) {
    
    inline def setPolicy(value: SasPortalPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
