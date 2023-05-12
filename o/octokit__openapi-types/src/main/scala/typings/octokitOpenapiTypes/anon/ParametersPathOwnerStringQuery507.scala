package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery507 extends StObject {
  
  var parameters: PathOwnerStringQuery507
  
  var responses: `200ContentApplicationjsonNames`
}
object ParametersPathOwnerStringQuery507 {
  
  inline def apply(parameters: PathOwnerStringQuery507, responses: `200ContentApplicationjsonNames`): ParametersPathOwnerStringQuery507 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQuery507] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQuery507): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNames`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
