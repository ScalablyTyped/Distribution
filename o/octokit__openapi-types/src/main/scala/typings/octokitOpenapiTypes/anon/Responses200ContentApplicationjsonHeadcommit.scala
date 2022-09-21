package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonHeadcommit extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonHeadsha
  
  var responses: `200ContentApplicationjsonHeadcommit`
}
object Responses200ContentApplicationjsonHeadcommit {
  
  inline def apply(
    parameters: `491`,
    requestBody: ContentApplicationjsonHeadsha,
    responses: `200ContentApplicationjsonHeadcommit`
  ): Responses200ContentApplicationjsonHeadcommit = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonHeadcommit]
  }
  
  extension [Self <: Responses200ContentApplicationjsonHeadcommit](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonHeadsha): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonHeadcommit`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
