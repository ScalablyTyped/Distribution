package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryParticipating extends StObject {
  
  var parameters: QueryParticipating
  
  var responses: `200304401`
}
object ParametersQueryParticipating {
  
  inline def apply(parameters: QueryParticipating, responses: `200304401`): ParametersQueryParticipating = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryParticipating]
  }
  
  extension [Self <: ParametersQueryParticipating](x: Self) {
    
    inline def setParameters(value: QueryParticipating): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
