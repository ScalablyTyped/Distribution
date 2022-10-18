package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNewname extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonNewname
  
  var responses: `201403404422`
}
object RequestBodyContentApplicationjsonNewname {
  
  inline def apply(parameters: PathBranchOwner, requestBody: ContentApplicationjsonNewname, responses: `201403404422`): RequestBodyContentApplicationjsonNewname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNewname]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNewname](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
