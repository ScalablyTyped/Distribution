package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content448 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonHeadsha
  
  var responses: `200Content448`
}
object Responses200Content448 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonHeadsha, responses: `200Content448`): Responses200Content448 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content448]
  }
  
  extension [Self <: Responses200Content448](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonHeadsha): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content448`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
