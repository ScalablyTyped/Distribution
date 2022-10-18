package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageRole extends StObject {
  
  var parameters: QueryPerpageRole
  
  var responses: `53`
}
object ParametersQueryPerpageRole {
  
  inline def apply(parameters: QueryPerpageRole, responses: `53`): ParametersQueryPerpageRole = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageRole]
  }
  
  extension [Self <: ParametersQueryPerpageRole](x: Self) {
    
    inline def setParameters(value: QueryPerpageRole): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `53`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
