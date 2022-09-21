package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304400403 extends StObject {
  
  var parameters: PathOrgString
  
  var requestBody: ContentApplicationjsonExternalId
  
  var responses: `304400403`
}
object Responses304400403 {
  
  inline def apply(parameters: PathOrgString, requestBody: ContentApplicationjsonExternalId, responses: `304400403`): Responses304400403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304400403]
  }
  
  extension [Self <: Responses304400403](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExternalId): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
