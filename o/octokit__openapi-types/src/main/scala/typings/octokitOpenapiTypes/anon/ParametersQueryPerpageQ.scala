package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageQ extends StObject {
  
  var parameters: QueryPerpageQ
  
  var responses: `304403404422`
}
object ParametersQueryPerpageQ {
  
  inline def apply(parameters: QueryPerpageQ, responses: `304403404422`): ParametersQueryPerpageQ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageQ]
  }
  
  extension [Self <: ParametersQueryPerpageQ](x: Self) {
    
    inline def setParameters(value: QueryPerpageQ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
