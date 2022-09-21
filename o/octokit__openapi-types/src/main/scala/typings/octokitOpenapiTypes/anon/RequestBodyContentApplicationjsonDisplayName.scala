package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDisplayName extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: ContentApplicationjsonDisplayName
  
  var responses: `201Content350`
}
object RequestBodyContentApplicationjsonDisplayName {
  
  inline def apply(
    parameters: PathEnterprise,
    requestBody: ContentApplicationjsonDisplayName,
    responses: `201Content350`
  ): RequestBodyContentApplicationjsonDisplayName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDisplayName]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDisplayName](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDisplayName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content350`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
