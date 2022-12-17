package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonReposcount extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonMaintainers
  
  var responses: `201ContentApplicationjsonReposcount`
}
object Responses201ContentApplicationjsonReposcount {
  
  inline def apply(
    parameters: `433`,
    requestBody: ContentApplicationjsonMaintainers,
    responses: `201ContentApplicationjsonReposcount`
  ): Responses201ContentApplicationjsonReposcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonReposcount]
  }
  
  extension [Self <: Responses201ContentApplicationjsonReposcount](x: Self) {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMaintainers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonReposcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
