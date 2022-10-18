package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202409422 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonRequiredcontexts
  
  var responses: `202409422`
}
object Responses202409422 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonRequiredcontexts, responses: `202409422`): Responses202409422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202409422]
  }
  
  extension [Self <: Responses202409422](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRequiredcontexts): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
