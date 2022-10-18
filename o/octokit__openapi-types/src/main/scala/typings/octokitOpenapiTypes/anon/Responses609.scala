package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses609 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjson62
  
  var responses: `609`
}
object Responses609 {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberTeamid,
    requestBody: ContentApplicationjson62,
    responses: `609`
  ): Responses609 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses609]
  }
  
  extension [Self <: Responses609](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `609`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
