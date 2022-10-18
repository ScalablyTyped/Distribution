package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonNodeidUser extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var requestBody: ContentApplicationjson62
  
  var responses: `200ContentApplicationjsonNodeidUser`
}
object Responses200ContentApplicationjsonNodeidUser {
  
  inline def apply(
    parameters: PathDiscussionnumber,
    requestBody: ContentApplicationjson62,
    responses: `200ContentApplicationjsonNodeidUser`
  ): Responses200ContentApplicationjsonNodeidUser = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonNodeidUser]
  }
  
  extension [Self <: Responses200ContentApplicationjsonNodeidUser](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
