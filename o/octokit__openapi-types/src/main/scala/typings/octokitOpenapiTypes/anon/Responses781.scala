package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses781 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjson139
  
  var responses: `781`
}
object Responses781 {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberTeamid,
    requestBody: ContentApplicationjson139,
    responses: `781`
  ): Responses781 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses781]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses781] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `781`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
