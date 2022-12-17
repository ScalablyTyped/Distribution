package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageProtected extends StObject {
  
  var parameters: QueryPerpageProtected
  
  var responses: `200Content487`
}
object ParametersQueryPerpageProtected {
  
  inline def apply(parameters: QueryPerpageProtected, responses: `200Content487`): ParametersQueryPerpageProtected = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageProtected]
  }
  
  extension [Self <: ParametersQueryPerpageProtected](x: Self) {
    
    inline def setParameters(value: QueryPerpageProtected): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content487`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
