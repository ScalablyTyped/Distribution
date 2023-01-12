package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnerid extends StObject {
  
  var parameters: PathEnterpriseRunnerid
  
  var responses: `200Content22`
}
object ParametersPathEnterpriseRunnerid {
  
  inline def apply(parameters: PathEnterpriseRunnerid, responses: `200Content22`): ParametersPathEnterpriseRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterpriseRunnerid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content22`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
