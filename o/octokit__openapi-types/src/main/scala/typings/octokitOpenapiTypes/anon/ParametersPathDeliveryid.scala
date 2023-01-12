package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryid extends StObject {
  
  var parameters: PathDeliveryid
  
  var responses: `422`
}
object ParametersPathDeliveryid {
  
  inline def apply(parameters: PathDeliveryid, responses: `422`): ParametersPathDeliveryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeliveryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeliveryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
