package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content568 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: ContentApplicationjsonBodyComments
  
  var responses: `200Content568`
}
object Responses200Content568 {
  
  inline def apply(
    parameters: PathPullnumberRepo,
    requestBody: ContentApplicationjsonBodyComments,
    responses: `200Content568`
  ): Responses200Content568 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content568]
  }
  
  extension [Self <: Responses200Content568](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyComments): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content568`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
