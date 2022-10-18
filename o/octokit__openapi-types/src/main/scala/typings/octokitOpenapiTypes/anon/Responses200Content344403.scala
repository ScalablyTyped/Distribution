package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content344403 extends StObject {
  
  var parameters: Path325
  
  var requestBody: ContentApplicationjson48
  
  var responses: `200Content344403`
}
object Responses200Content344403 {
  
  inline def apply(parameters: Path325, requestBody: ContentApplicationjson48, responses: `200Content344403`): Responses200Content344403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content344403]
  }
  
  extension [Self <: Responses200Content344403](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson48): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content344403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
