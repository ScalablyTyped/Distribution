package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberOwnerQuery473 extends StObject {
  
  var parameters: PathAttemptnumberOwnerQuery473
  
  var responses: `200ContentApplicationjsonJobsTotalcount`
}
object ParametersPathAttemptnumberOwnerQuery473 {
  
  inline def apply(parameters: PathAttemptnumberOwnerQuery473, responses: `200ContentApplicationjsonJobsTotalcount`): ParametersPathAttemptnumberOwnerQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberOwnerQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAttemptnumberOwnerQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAttemptnumberOwnerQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonJobsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
