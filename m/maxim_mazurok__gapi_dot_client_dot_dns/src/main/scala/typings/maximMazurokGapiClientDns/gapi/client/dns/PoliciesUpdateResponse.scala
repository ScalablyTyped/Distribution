package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesUpdateResponse extends StObject {
  
  var header: js.UndefOr[ResponseHeader] = js.native
  
  var policy: js.UndefOr[Policy] = js.native
}
object PoliciesUpdateResponse {
  
  @scala.inline
  def apply(): PoliciesUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoliciesUpdateResponse]
  }
  
  @scala.inline
  implicit class PoliciesUpdateResponseMutableBuilder[Self <: PoliciesUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: ResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
