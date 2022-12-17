package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRestrictedtoworkflows extends StObject {
  
  var parameters: `57`
  
  var requestBody: ContentApplicationjsonRestrictedtoworkflows
  
  var responses: `201Content64`
}
object RequestBodyContentApplicationjsonRestrictedtoworkflows {
  
  inline def apply(
    parameters: `57`,
    requestBody: ContentApplicationjsonRestrictedtoworkflows,
    responses: `201Content64`
  ): RequestBodyContentApplicationjsonRestrictedtoworkflows = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRestrictedtoworkflows]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonRestrictedtoworkflows](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRestrictedtoworkflows): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content64`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
