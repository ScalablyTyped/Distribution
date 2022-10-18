package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content508HeadersLocation extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonRefSha
  
  var responses: `201Content508HeadersLocation`
}
object Responses201Content508HeadersLocation {
  
  inline def apply(
    parameters: `395`,
    requestBody: ContentApplicationjsonRefSha,
    responses: `201Content508HeadersLocation`
  ): Responses201Content508HeadersLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content508HeadersLocation]
  }
  
  extension [Self <: Responses201Content508HeadersLocation](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRefSha): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content508HeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
