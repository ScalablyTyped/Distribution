package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnerid extends StObject {
  
  var parameters: PathRunnerid
  
  var responses: `200Content63`
}
object ParametersPathRunnerid {
  
  inline def apply(parameters: PathRunnerid, responses: `200Content63`): ParametersPathRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunnerid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content63`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
