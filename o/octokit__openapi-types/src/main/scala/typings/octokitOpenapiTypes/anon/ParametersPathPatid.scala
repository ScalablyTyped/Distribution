package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPatid extends StObject {
  
  var parameters: PathPatid
  
  var requestBody: ContentApplicationjson58
  
  var responses: `204`
}
object ParametersPathPatid {
  
  inline def apply(parameters: PathPatid, requestBody: ContentApplicationjson58, responses: `204`): ParametersPathPatid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPatid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPatid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPatid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson58): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `204`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
