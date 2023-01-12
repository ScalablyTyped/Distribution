package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackageversionidNumber extends StObject {
  
  var parameters: PathPackageversionidNumber
  
  var responses: `200ContentApplicationjsonDeletedat`
}
object ParametersPathPackageversionidNumber {
  
  inline def apply(parameters: PathPackageversionidNumber, responses: `200ContentApplicationjsonDeletedat`): ParametersPathPackageversionidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackageversionidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackageversionidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackageversionidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeletedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
