package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalGetPolicyRequest extends StObject {
  
  /** Required. The resource for which the policy is being requested. */
  var resource: js.UndefOr[String] = js.undefined
}
object SasPortalGetPolicyRequest {
  
  @scala.inline
  def apply(): SasPortalGetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalGetPolicyRequest]
  }
  
  @scala.inline
  implicit class SasPortalGetPolicyRequestMutableBuilder[Self <: SasPortalGetPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
