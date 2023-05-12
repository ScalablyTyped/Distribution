package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProtectionruleid extends StObject {
  
  var parameters: PathProtectionruleid
  
  var responses: `200Content242`
}
object ParametersPathProtectionruleid {
  
  inline def apply(parameters: PathProtectionruleid, responses: `200Content242`): ParametersPathProtectionruleid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProtectionruleid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProtectionruleid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProtectionruleid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content242`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
