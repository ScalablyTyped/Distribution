package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content207 extends StObject {
  
  var parameters: PathRepoUsername
  
  var requestBody: ContentApplicationjson131
  
  var responses: `201Content207`
}
object Responses201Content207 {
  
  inline def apply(parameters: PathRepoUsername, requestBody: ContentApplicationjson131, responses: `201Content207`): Responses201Content207 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content207]
  }
  
  extension [Self <: Responses201Content207](x: Self) {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson131): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content207`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
