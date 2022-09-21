package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgResponses200Content94 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content94`
}
object ParametersPathOrgResponses200Content94 {
  
  inline def apply(parameters: PathOrg, responses: `200Content94`): ParametersPathOrgResponses200Content94 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgResponses200Content94]
  }
  
  extension [Self <: ParametersPathOrgResponses200Content94](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content94`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
