package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOutdated extends StObject {
  
  var parameters: QueryOutdated
  
  var responses: `200ContentHeaders`
}
object ParametersQueryOutdated {
  
  inline def apply(parameters: QueryOutdated, responses: `200ContentHeaders`): ParametersQueryOutdated = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOutdated]
  }
  
  extension [Self <: ParametersQueryOutdated](x: Self) {
    
    inline def setParameters(value: QueryOutdated): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentHeaders`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
