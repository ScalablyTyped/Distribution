package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200Content430 extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200Content430`
}
object ParametersPathOrgStringResponses200Content430 {
  
  inline def apply(parameters: PathOrgString, responses: `200Content430`): ParametersPathOrgStringResponses200Content430 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200Content430]
  }
  
  extension [Self <: ParametersPathOrgStringResponses200Content430](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content430`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
