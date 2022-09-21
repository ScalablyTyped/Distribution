package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgResponses200Content30 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content30`
}
object ParametersPathOrgResponses200Content30 {
  
  inline def apply(parameters: PathOrg, responses: `200Content30`): ParametersPathOrgResponses200Content30 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgResponses200Content30]
  }
  
  extension [Self <: ParametersPathOrgResponses200Content30](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content30`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
