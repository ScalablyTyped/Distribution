package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses400409422 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonHttpsenforced
  
  var responses: `400409422`
}
object Responses400409422 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonHttpsenforced, responses: `400409422`): Responses400409422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses400409422]
  }
  
  extension [Self <: Responses400409422](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonHttpsenforced): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
