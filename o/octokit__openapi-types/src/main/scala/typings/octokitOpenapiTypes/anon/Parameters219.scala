package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters219 extends StObject {
  
  var parameters: `219`
  
  var requestBody: ContentApplicationjsonCommitter
  
  var responses: `404409`
}
object Parameters219 {
  
  inline def apply(parameters: `219`, requestBody: ContentApplicationjsonCommitter, responses: `404409`): Parameters219 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters219]
  }
  
  extension [Self <: Parameters219](x: Self) {
    
    inline def setParameters(value: `219`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCommitter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
