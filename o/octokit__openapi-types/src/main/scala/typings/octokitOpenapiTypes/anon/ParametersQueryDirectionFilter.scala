package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionFilter extends StObject {
  
  var parameters: QueryDirectionFilter
  
  var responses: `200Content425`
}
object ParametersQueryDirectionFilter {
  
  inline def apply(parameters: QueryDirectionFilter, responses: `200Content425`): ParametersQueryDirectionFilter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionFilter]
  }
  
  extension [Self <: ParametersQueryDirectionFilter](x: Self) {
    
    inline def setParameters(value: QueryDirectionFilter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content425`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
