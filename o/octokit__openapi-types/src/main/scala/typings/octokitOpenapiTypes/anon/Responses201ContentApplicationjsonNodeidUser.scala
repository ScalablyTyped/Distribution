package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonNodeidUser extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumber
  
  var requestBody: ContentApplicationjson62
  
  var responses: `201ContentApplicationjsonNodeidUser`
}
object Responses201ContentApplicationjsonNodeidUser {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumber,
    requestBody: ContentApplicationjson62,
    responses: `201ContentApplicationjsonNodeidUser`
  ): Responses201ContentApplicationjsonNodeidUser = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonNodeidUser]
  }
  
  extension [Self <: Responses201ContentApplicationjsonNodeidUser](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
