package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content193 extends StObject {
  
  var parameters: PathRepoUsername
  
  var requestBody: ContentApplicationjson123
  
  var responses: `201Content193`
}
object Responses201Content193 {
  
  inline def apply(parameters: PathRepoUsername, requestBody: ContentApplicationjson123, responses: `201Content193`): Responses201Content193 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content193]
  }
  
  extension [Self <: Responses201Content193](x: Self) {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson123): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content193`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
