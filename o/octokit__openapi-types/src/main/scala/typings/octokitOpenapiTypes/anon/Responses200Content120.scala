package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content120 extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var requestBody: ContentApplicationjson121
  
  var responses: `200Content120`
}
object Responses200Content120 {
  
  inline def apply(
    parameters: PathDiscussionnumber,
    requestBody: ContentApplicationjson121,
    responses: `200Content120`
  ): Responses200Content120 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content120]
  }
  
  extension [Self <: Responses200Content120](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content120`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
