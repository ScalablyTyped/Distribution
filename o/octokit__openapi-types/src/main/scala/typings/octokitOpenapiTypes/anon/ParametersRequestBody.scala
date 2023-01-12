package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRequestBody extends StObject {
  
  var parameters: PathInstallationid
  
  var requestBody: ContentApplicationjsonPermissions
  
  var responses: `401`
}
object ParametersRequestBody {
  
  inline def apply(parameters: PathInstallationid, requestBody: ContentApplicationjsonPermissions, responses: `401`): ParametersRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPermissions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
