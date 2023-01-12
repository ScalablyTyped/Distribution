package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidNumber extends StObject {
  
  var parameters: PathDeliveryidNumber
  
  var responses: `200400422`
}
object ParametersPathDeliveryidNumber {
  
  inline def apply(parameters: PathDeliveryidNumber, responses: `200400422`): ParametersPathDeliveryidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeliveryidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeliveryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
