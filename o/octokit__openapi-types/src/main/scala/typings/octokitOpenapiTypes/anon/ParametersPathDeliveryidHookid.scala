package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookid extends StObject {
  
  var parameters: PathDeliveryidHookid
  
  var responses: `422`
}
object ParametersPathDeliveryidHookid {
  
  inline def apply(parameters: PathDeliveryidHookid, responses: `422`): ParametersPathDeliveryidHookid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeliveryidHookid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeliveryidHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
