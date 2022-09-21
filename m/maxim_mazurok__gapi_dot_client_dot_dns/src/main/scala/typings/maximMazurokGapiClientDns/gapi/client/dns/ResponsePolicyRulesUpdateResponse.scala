package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePolicyRulesUpdateResponse extends StObject {
  
  var header: js.UndefOr[ResponseHeader] = js.undefined
  
  var responsePolicyRule: js.UndefOr[ResponsePolicyRule] = js.undefined
}
object ResponsePolicyRulesUpdateResponse {
  
  inline def apply(): ResponsePolicyRulesUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsePolicyRulesUpdateResponse]
  }
  
  extension [Self <: ResponsePolicyRulesUpdateResponse](x: Self) {
    
    inline def setHeader(value: ResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setResponsePolicyRule(value: ResponsePolicyRule): Self = StObject.set(x, "responsePolicyRule", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyRuleUndefined: Self = StObject.set(x, "responsePolicyRule", js.undefined)
  }
}
