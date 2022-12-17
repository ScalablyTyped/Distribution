package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonTeamsArray extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonTeamsArray
  
  var responses: `200170422`
}
object RequestBodyContentApplicationjsonTeamsArray {
  
  inline def apply(parameters: PathBranch, requestBody: ContentApplicationjsonTeamsArray, responses: `200170422`): RequestBodyContentApplicationjsonTeamsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonTeamsArray]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonTeamsArray](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTeamsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200170422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
