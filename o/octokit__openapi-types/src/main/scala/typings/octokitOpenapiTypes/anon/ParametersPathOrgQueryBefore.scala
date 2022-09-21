package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgQueryBefore extends StObject {
  
  var parameters: PathOrgQueryBefore
  
  var responses: `503`
}
object ParametersPathOrgQueryBefore {
  
  inline def apply(parameters: PathOrgQueryBefore, responses: `503`): ParametersPathOrgQueryBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgQueryBefore]
  }
  
  extension [Self <: ParametersPathOrgQueryBefore](x: Self) {
    
    inline def setParameters(value: PathOrgQueryBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
