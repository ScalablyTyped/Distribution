package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content347 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonExcludegitdata
  
  var responses: `201Content347`
}
object Responses201Content347 {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjsonExcludegitdata, responses: `201Content347`): Responses201Content347 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content347]
  }
  
  extension [Self <: Responses201Content347](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExcludegitdata): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content347`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
