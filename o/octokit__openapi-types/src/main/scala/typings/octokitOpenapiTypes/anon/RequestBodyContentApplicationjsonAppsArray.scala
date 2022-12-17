package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAppsArray extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonAppsArray
  
  var responses: `200Content169422`
}
object RequestBodyContentApplicationjsonAppsArray {
  
  inline def apply(
    parameters: PathBranch,
    requestBody: ContentApplicationjsonAppsArray,
    responses: `200Content169422`
  ): RequestBodyContentApplicationjsonAppsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAppsArray]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAppsArray](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAppsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content169422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
