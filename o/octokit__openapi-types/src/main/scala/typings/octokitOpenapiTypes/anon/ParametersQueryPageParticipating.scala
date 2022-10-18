package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPageParticipating extends StObject {
  
  var parameters: QueryPageParticipating
  
  var responses: `550`
}
object ParametersQueryPageParticipating {
  
  inline def apply(parameters: QueryPageParticipating, responses: `550`): ParametersQueryPageParticipating = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPageParticipating]
  }
  
  extension [Self <: ParametersQueryPageParticipating](x: Self) {
    
    inline def setParameters(value: QueryPageParticipating): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `550`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
