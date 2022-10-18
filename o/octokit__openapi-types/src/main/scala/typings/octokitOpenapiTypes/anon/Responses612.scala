package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses612 extends StObject {
  
  var parameters: PathOwnerRepoTeamid
  
  var requestBody: ContentApplicationjson194
  
  var responses: `612`
}
object Responses612 {
  
  inline def apply(parameters: PathOwnerRepoTeamid, requestBody: ContentApplicationjson194, responses: `612`): Responses612 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses612]
  }
  
  extension [Self <: Responses612](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson194): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `612`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
