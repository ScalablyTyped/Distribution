package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content387304 extends StObject {
  
  var parameters: Path386
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `200Content387304`
}
object Responses200Content387304 {
  
  inline def apply(parameters: Path386, requestBody: ContentApplicationjsonNameString, responses: `200Content387304`): Responses200Content387304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content387304]
  }
  
  extension [Self <: Responses200Content387304](x: Self) {
    
    inline def setParameters(value: Path386): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content387304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
