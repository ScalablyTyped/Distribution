package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePoliciesPatchResponse extends StObject {
  
  var header: js.UndefOr[ResponseHeader] = js.undefined
  
  var responsePolicy: js.UndefOr[ResponsePolicy] = js.undefined
}
object ResponsePoliciesPatchResponse {
  
  inline def apply(): ResponsePoliciesPatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsePoliciesPatchResponse]
  }
  
  extension [Self <: ResponsePoliciesPatchResponse](x: Self) {
    
    inline def setHeader(value: ResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setResponsePolicy(value: ResponsePolicy): Self = StObject.set(x, "responsePolicy", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyUndefined: Self = StObject.set(x, "responsePolicy", js.undefined)
  }
}
