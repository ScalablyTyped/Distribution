package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters525 extends StObject {
  
  var parameters: `525`
  
  var requestBody: ContentApplicationjsonCommitter
  
  var responses: `200201404`
}
object Parameters525 {
  
  inline def apply(parameters: `525`, requestBody: ContentApplicationjsonCommitter, responses: `200201404`): Parameters525 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters525]
  }
  
  extension [Self <: Parameters525](x: Self) {
    
    inline def setParameters(value: `525`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCommitter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
