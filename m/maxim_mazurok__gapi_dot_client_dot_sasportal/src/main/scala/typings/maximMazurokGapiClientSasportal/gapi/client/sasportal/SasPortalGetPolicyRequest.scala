package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalGetPolicyRequest extends StObject {
  
  /** Required. The resource for which the policy is being requested. */
  var resource: js.UndefOr[String] = js.undefined
}
object SasPortalGetPolicyRequest {
  
  inline def apply(): SasPortalGetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalGetPolicyRequest]
  }
  
  extension [Self <: SasPortalGetPolicyRequest](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
