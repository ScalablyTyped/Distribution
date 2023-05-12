package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenameString extends StObject {
  
  var parameters: PathPackagenameString
  
  var responses: `200ContentApplicationjsonOwnerPackagetype`
}
object ParametersPathPackagenameString {
  
  inline def apply(parameters: PathPackagenameString, responses: `200ContentApplicationjsonOwnerPackagetype`): ParametersPathPackagenameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOwnerPackagetype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
