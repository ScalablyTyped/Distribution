package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunneridNumber extends StObject {
  
  var parameters: PathRunneridNumber
  
  var responses: `200ContentApplicationjsonOs`
}
object ParametersPathRunneridNumber {
  
  inline def apply(parameters: PathRunneridNumber, responses: `200ContentApplicationjsonOs`): ParametersPathRunneridNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunneridNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunneridNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOs`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
