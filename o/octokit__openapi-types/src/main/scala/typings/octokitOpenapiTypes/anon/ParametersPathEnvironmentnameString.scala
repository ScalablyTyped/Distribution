package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameString extends StObject {
  
  var parameters: PathEnvironmentnameString
  
  var responses: `200ContentApplicationjson483`
}
object ParametersPathEnvironmentnameString {
  
  inline def apply(parameters: PathEnvironmentnameString, responses: `200ContentApplicationjson483`): ParametersPathEnvironmentnameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson483`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
