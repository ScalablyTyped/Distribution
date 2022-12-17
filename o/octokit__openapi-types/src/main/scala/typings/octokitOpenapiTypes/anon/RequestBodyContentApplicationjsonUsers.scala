package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonUsers extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonUsers
  
  var responses: `200Content69422`
}
object RequestBodyContentApplicationjsonUsers {
  
  inline def apply(parameters: PathBranch, requestBody: ContentApplicationjsonUsers, responses: `200Content69422`): RequestBodyContentApplicationjsonUsers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonUsers]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonUsers](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUsers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content69422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
