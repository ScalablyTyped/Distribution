package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonContextsArray extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonContextsArray
  
  var responses: `200Content41404422`
}
object RequestBodyContentApplicationjsonContextsArray {
  
  inline def apply(
    parameters: PathBranch,
    requestBody: ContentApplicationjsonContextsArray,
    responses: `200Content41404422`
  ): RequestBodyContentApplicationjsonContextsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonContextsArray]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonContextsArray](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContextsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content41404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
