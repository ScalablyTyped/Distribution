package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content118 extends StObject {
  
  var parameters: PathCommentnumber
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200Content118`
}
object Responses200Content118 {
  
  inline def apply(parameters: PathCommentnumber, requestBody: ContentApplicationjsonBody, responses: `200Content118`): Responses200Content118 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content118]
  }
  
  extension [Self <: Responses200Content118](x: Self) {
    
    inline def setParameters(value: PathCommentnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content118`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
