package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRepositories extends StObject {
  
  var parameters: PathClientid
  
  var requestBody: ContentApplicationjsonRepositories
  
  var responses: `403`
}
object RequestBodyContentApplicationjsonRepositories {
  
  inline def apply(parameters: PathClientid, requestBody: ContentApplicationjsonRepositories, responses: `403`): RequestBodyContentApplicationjsonRepositories = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonRepositories] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathClientid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
