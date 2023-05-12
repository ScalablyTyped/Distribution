package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgQueryRedelivery extends StObject {
  
  var parameters: PathHookidOrgQueryRedelivery
  
  var responses: `400422`
}
object ParametersPathHookidOrgQueryRedelivery {
  
  inline def apply(parameters: PathHookidOrgQueryRedelivery, responses: `400422`): ParametersPathHookidOrgQueryRedelivery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgQueryRedelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOrgQueryRedelivery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOrgQueryRedelivery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
