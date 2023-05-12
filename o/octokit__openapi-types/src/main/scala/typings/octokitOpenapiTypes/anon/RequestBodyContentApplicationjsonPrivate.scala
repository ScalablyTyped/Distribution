package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPrivate extends StObject {
  
  var parameters: PathTeamslug
  
  var requestBody: ContentApplicationjsonPrivate
  
  var responses: `201Content115`
}
object RequestBodyContentApplicationjsonPrivate {
  
  inline def apply(parameters: PathTeamslug, requestBody: ContentApplicationjsonPrivate, responses: `201Content115`): RequestBodyContentApplicationjsonPrivate = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPrivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonPrivate] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrivate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
