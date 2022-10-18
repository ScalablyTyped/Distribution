package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content370 extends StObject {
  
  var parameters: Path364
  
  var requestBody: ContentApplicationjsonPrivate
  
  var responses: `201Content370`
}
object Responses201Content370 {
  
  inline def apply(parameters: Path364, requestBody: ContentApplicationjsonPrivate, responses: `201Content370`): Responses201Content370 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content370]
  }
  
  extension [Self <: Responses201Content370](x: Self) {
    
    inline def setParameters(value: Path364): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrivate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content370`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
