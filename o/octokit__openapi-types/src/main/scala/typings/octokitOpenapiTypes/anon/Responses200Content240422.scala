package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content240422 extends StObject {
  
  var parameters: Path238
  
  var requestBody: ContentApplicationjsonAccesstoken
  
  var responses: `200Content240422`
}
object Responses200Content240422 {
  
  inline def apply(parameters: Path238, requestBody: ContentApplicationjsonAccesstoken, responses: `200Content240422`): Responses200Content240422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content240422]
  }
  
  extension [Self <: Responses200Content240422](x: Self) {
    
    inline def setParameters(value: Path238): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAccesstoken): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content240422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
