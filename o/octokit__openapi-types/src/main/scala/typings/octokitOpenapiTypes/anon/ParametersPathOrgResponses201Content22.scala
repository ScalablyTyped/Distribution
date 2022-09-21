package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgResponses201Content22 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `201Content22`
}
object ParametersPathOrgResponses201Content22 {
  
  inline def apply(parameters: PathOrg, responses: `201Content22`): ParametersPathOrgResponses201Content22 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgResponses201Content22]
  }
  
  extension [Self <: ParametersPathOrgResponses201Content22](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content22`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
