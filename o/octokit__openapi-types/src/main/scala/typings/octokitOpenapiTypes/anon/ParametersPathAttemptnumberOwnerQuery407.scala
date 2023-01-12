package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberOwnerQuery407 extends StObject {
  
  var parameters: PathAttemptnumberOwnerQuery407
  
  var responses: `200ContentApplicationjsonJobsTotalcount`
}
object ParametersPathAttemptnumberOwnerQuery407 {
  
  inline def apply(parameters: PathAttemptnumberOwnerQuery407, responses: `200ContentApplicationjsonJobsTotalcount`): ParametersPathAttemptnumberOwnerQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberOwnerQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAttemptnumberOwnerQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAttemptnumberOwnerQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonJobsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
