package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200562 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: ContentApplicationjsonBaseBody
  
  var responses: `200562`
}
object Responses200562 {
  
  inline def apply(parameters: PathPullnumberRepo, requestBody: ContentApplicationjsonBaseBody, responses: `200562`): Responses200562 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200562]
  }
  
  extension [Self <: Responses200562](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaseBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200562`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
