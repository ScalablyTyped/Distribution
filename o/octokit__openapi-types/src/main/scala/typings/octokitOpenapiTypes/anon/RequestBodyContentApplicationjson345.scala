package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson345 extends StObject {
  
  var parameters: PathRepoTeamid
  
  var requestBody: ContentApplicationjson345
  
  var responses: `344`
}
object RequestBodyContentApplicationjson345 {
  
  inline def apply(parameters: PathRepoTeamid, requestBody: ContentApplicationjson345, responses: `344`): RequestBodyContentApplicationjson345 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson345]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson345] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson345): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `344`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
