package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnerid extends StObject {
  
  var parameters: PathOrgRunnerid
  
  var responses: `200Content22`
}
object ParametersPathOrgRunnerid {
  
  inline def apply(parameters: PathOrgRunnerid, responses: `200Content22`): ParametersPathOrgRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnerid]
  }
  
  extension [Self <: ParametersPathOrgRunnerid](x: Self) {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content22`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
