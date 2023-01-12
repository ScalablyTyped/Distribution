package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBypasspullrequestallowances extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonBypasspullrequestallowances
  
  var responses: `200Content166422`
}
object RequestBodyContentApplicationjsonBypasspullrequestallowances {
  
  inline def apply(
    parameters: PathBranch,
    requestBody: ContentApplicationjsonBypasspullrequestallowances,
    responses: `200Content166422`
  ): RequestBodyContentApplicationjsonBypasspullrequestallowances = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBypasspullrequestallowances]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBypasspullrequestallowances] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBypasspullrequestallowances): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content166422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
