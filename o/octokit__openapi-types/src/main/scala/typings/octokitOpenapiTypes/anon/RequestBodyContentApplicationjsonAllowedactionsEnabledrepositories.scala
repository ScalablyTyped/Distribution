package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowedactionsEnabledrepositories extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonAllowedactionsEnabledrepositories
}
object RequestBodyContentApplicationjsonAllowedactionsEnabledrepositories {
  
  inline def apply(parameters: `37`, requestBody: ContentApplicationjsonAllowedactionsEnabledrepositories): RequestBodyContentApplicationjsonAllowedactionsEnabledrepositories = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowedactionsEnabledrepositories]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAllowedactionsEnabledrepositories](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowedactionsEnabledrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
