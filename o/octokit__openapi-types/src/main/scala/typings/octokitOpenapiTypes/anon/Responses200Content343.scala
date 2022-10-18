package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content343 extends StObject {
  
  var parameters: Path622
  
  var requestBody: ContentApplicationjsonRecentfolders
  
  var responses: `200Content343`
}
object Responses200Content343 {
  
  inline def apply(parameters: Path622, requestBody: ContentApplicationjsonRecentfolders, responses: `200Content343`): Responses200Content343 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content343]
  }
  
  extension [Self <: Responses200Content343](x: Self) {
    
    inline def setParameters(value: Path622): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRecentfolders): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content343`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
