package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNewname extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonNewname
  
  var responses: `201403404`
}
object RequestBodyContentApplicationjsonNewname {
  
  inline def apply(parameters: PathBranch, requestBody: ContentApplicationjsonNewname, responses: `201403404`): RequestBodyContentApplicationjsonNewname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNewname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonNewname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
