package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200307403 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonDefaultbranch
  
  var responses: `200307403`
}
object Responses200307403 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonDefaultbranch, responses: `200307403`): Responses200307403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200307403]
  }
  
  extension [Self <: Responses200307403](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDefaultbranch): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200307403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
