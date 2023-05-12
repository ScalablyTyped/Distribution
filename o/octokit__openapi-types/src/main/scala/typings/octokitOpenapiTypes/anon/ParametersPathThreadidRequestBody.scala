package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathThreadidRequestBody extends StObject {
  
  var parameters: PathThreadid
  
  var requestBody: js.UndefOr[ContentApplicationjsonIgnored] = js.undefined
  
  var responses: `200304401403`
}
object ParametersPathThreadidRequestBody {
  
  inline def apply(parameters: PathThreadid, responses: `200304401403`): ParametersPathThreadidRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathThreadidRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathThreadidRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIgnored): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200304401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
