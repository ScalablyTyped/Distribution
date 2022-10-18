package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content277 extends StObject {
  
  var parameters: Path273
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201Content277`
}
object Responses201Content277 {
  
  inline def apply(parameters: Path273, requestBody: ContentApplicationjsonBodyString, responses: `201Content277`): Responses201Content277 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content277]
  }
  
  extension [Self <: Responses201Content277](x: Self) {
    
    inline def setParameters(value: Path273): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content277`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
