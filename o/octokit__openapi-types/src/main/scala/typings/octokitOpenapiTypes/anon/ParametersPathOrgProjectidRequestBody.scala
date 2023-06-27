package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgProjectidRequestBody extends StObject {
  
  var parameters: PathOrgProjectid
  
  var requestBody: js.UndefOr[Content149] = js.undefined
  
  var responses: `403ContentApplicationjsonDocumentationurl`
}
object ParametersPathOrgProjectidRequestBody {
  
  inline def apply(parameters: PathOrgProjectid, responses: `403ContentApplicationjsonDocumentationurl`): ParametersPathOrgProjectidRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgProjectidRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgProjectidRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content149): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
