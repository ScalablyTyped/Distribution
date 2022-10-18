package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content560HeadersLocation extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: ContentApplicationjsonInreplyto
  
  var responses: `201Content560HeadersLocation`
}
object Responses201Content560HeadersLocation {
  
  inline def apply(
    parameters: PathPullnumberRepo,
    requestBody: ContentApplicationjsonInreplyto,
    responses: `201Content560HeadersLocation`
  ): Responses201Content560HeadersLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content560HeadersLocation]
  }
  
  extension [Self <: Responses201Content560HeadersLocation](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonInreplyto): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content560HeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
