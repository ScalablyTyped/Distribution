package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content385304 extends StObject {
  
  var parameters: Path384
  
  var requestBody: ContentApplicationjsonNote
  
  var responses: `200Content385304`
}
object Responses200Content385304 {
  
  inline def apply(parameters: Path384, requestBody: ContentApplicationjsonNote, responses: `200Content385304`): Responses200Content385304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content385304]
  }
  
  extension [Self <: Responses200Content385304](x: Self) {
    
    inline def setParameters(value: Path384): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNote): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content385304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
