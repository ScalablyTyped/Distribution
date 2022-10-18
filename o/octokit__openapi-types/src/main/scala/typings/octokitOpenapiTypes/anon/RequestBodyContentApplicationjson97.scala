package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson97 extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjson97
  
  var responses: `20096422Content8`
}
object RequestBodyContentApplicationjson97 {
  
  inline def apply(parameters: PathBranchOwner, requestBody: ContentApplicationjson97, responses: `20096422Content8`): RequestBodyContentApplicationjson97 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson97]
  }
  
  extension [Self <: RequestBodyContentApplicationjson97](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson97): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20096422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
