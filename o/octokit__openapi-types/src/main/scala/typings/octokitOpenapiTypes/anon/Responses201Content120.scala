package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content120 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumber
  
  var requestBody: ContentApplicationjson121
  
  var responses: `201Content120`
}
object Responses201Content120 {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumber,
    requestBody: ContentApplicationjson121,
    responses: `201Content120`
  ): Responses201Content120 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content120]
  }
  
  extension [Self <: Responses201Content120](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content120`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
