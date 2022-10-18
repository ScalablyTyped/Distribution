package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringQueryBefore extends StObject {
  
  var parameters: PathOrgStringQueryBefore
  
  var responses: `503`
}
object ParametersPathOrgStringQueryBefore {
  
  inline def apply(parameters: PathOrgStringQueryBefore, responses: `503`): ParametersPathOrgStringQueryBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringQueryBefore]
  }
  
  extension [Self <: ParametersPathOrgStringQueryBefore](x: Self) {
    
    inline def setParameters(value: PathOrgStringQueryBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
