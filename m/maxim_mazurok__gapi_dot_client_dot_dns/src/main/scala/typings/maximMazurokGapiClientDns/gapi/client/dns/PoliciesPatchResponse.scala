package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoliciesPatchResponse extends StObject {
  
  var header: js.UndefOr[ResponseHeader] = js.undefined
  
  var policy: js.UndefOr[Policy] = js.undefined
}
object PoliciesPatchResponse {
  
  @scala.inline
  def apply(): PoliciesPatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoliciesPatchResponse]
  }
  
  @scala.inline
  implicit class PoliciesPatchResponseMutableBuilder[Self <: PoliciesPatchResponse] (val x: Self) extends AnyVal {
    
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
