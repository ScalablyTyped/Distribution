package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgResponses200Content17 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content17`
}
object ParametersPathOrgResponses200Content17 {
  
  inline def apply(parameters: PathOrg, responses: `200Content17`): ParametersPathOrgResponses200Content17 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgResponses200Content17]
  }
  
  extension [Self <: ParametersPathOrgResponses200Content17](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content17`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
