package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery205 extends StObject {
  
  var parameters: PathOwnerStringQuery205
  
  var responses: `200ContentApplicationjsonErrorsArray`
}
object ParametersPathOwnerStringQuery205 {
  
  inline def apply(parameters: PathOwnerStringQuery205, responses: `200ContentApplicationjsonErrorsArray`): ParametersPathOwnerStringQuery205 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery205]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQuery205] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQuery205): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonErrorsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
