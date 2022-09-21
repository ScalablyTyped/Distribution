package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgResponses200Content32 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content32`
}
object ParametersPathOrgResponses200Content32 {
  
  inline def apply(parameters: PathOrg, responses: `200Content32`): ParametersPathOrgResponses200Content32 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgResponses200Content32]
  }
  
  extension [Self <: ParametersPathOrgResponses200Content32](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content32`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
