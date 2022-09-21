package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringQueryCountFilter extends StObject {
  
  var parameters: PathOrgStringQueryCountFilter
  
  var responses: `200304400`
}
object ParametersPathOrgStringQueryCountFilter {
  
  inline def apply(parameters: PathOrgStringQueryCountFilter, responses: `200304400`): ParametersPathOrgStringQueryCountFilter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringQueryCountFilter]
  }
  
  extension [Self <: ParametersPathOrgStringQueryCountFilter](x: Self) {
    
    inline def setParameters(value: PathOrgStringQueryCountFilter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
