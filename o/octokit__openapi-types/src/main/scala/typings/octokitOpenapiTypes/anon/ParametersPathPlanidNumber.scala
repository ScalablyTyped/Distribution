package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPlanidNumber extends StObject {
  
  var parameters: PathPlanidNumber
  
  var responses: `401404422`
}
object ParametersPathPlanidNumber {
  
  inline def apply(parameters: PathPlanidNumber, responses: `401404422`): ParametersPathPlanidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPlanidNumber]
  }
  
  extension [Self <: ParametersPathPlanidNumber](x: Self) {
    
    inline def setParameters(value: PathPlanidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
