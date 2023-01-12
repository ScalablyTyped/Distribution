package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidOrgResponses202400422 extends StObject {
  
  var parameters: PathDeliveryidHookidOrg
  
  var responses: `202400422`
}
object ParametersPathDeliveryidHookidOrgResponses202400422 {
  
  inline def apply(parameters: PathDeliveryidHookidOrg, responses: `202400422`): ParametersPathDeliveryidHookidOrgResponses202400422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidOrgResponses202400422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeliveryidHookidOrgResponses202400422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeliveryidHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
