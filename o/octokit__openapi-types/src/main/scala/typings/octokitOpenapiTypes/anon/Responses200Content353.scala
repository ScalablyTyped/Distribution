package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content353 extends StObject {
  
  var parameters: PathScimuserid
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `200Content353`
}
object Responses200Content353 {
  
  inline def apply(parameters: PathScimuserid, requestBody: ContentApplicationjsonEmails, responses: `200Content353`): Responses200Content353 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content353]
  }
  
  extension [Self <: Responses200Content353](x: Self) {
    
    inline def setParameters(value: PathScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content353`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
