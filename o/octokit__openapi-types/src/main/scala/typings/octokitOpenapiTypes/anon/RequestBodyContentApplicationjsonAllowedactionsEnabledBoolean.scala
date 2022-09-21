package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonAllowedactionsEnabledBoolean
}
object RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean {
  
  inline def apply(parameters: `491`, requestBody: ContentApplicationjsonAllowedactionsEnabledBoolean): RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAllowedactionsEnabledBoolean](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowedactionsEnabledBoolean): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
