package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameRepositoryidRequestBodyContentApplicationjson193 extends StObject {
  
  var parameters: PathNameRepositoryid
  
  var requestBody: ContentApplicationjson193
}
object ParametersPathNameRepositoryidRequestBodyContentApplicationjson193 {
  
  inline def apply(parameters: PathNameRepositoryid, requestBody: ContentApplicationjson193): ParametersPathNameRepositoryidRequestBodyContentApplicationjson193 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameRepositoryidRequestBodyContentApplicationjson193]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameRepositoryidRequestBodyContentApplicationjson193] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson193): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
