package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathThreadidNumberRequestBody extends StObject {
  
  var parameters: PathThreadidNumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonIgnored] = js.undefined
  
  var responses: `200ContentApplicationjsonRepositoryurl`
}
object ParametersPathThreadidNumberRequestBody {
  
  inline def apply(parameters: PathThreadidNumber, responses: `200ContentApplicationjsonRepositoryurl`): ParametersPathThreadidNumberRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathThreadidNumberRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathThreadidNumberRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIgnored): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoryurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
