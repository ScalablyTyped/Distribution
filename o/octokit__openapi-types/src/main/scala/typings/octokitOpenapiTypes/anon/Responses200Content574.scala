package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content574 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonConfigurationfilepath
  
  var responses: `200Content574`
}
object Responses200Content574 {
  
  inline def apply(
    parameters: `395`,
    requestBody: ContentApplicationjsonConfigurationfilepath,
    responses: `200Content574`
  ): Responses200Content574 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content574]
  }
  
  extension [Self <: Responses200Content574](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfigurationfilepath): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content574`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
