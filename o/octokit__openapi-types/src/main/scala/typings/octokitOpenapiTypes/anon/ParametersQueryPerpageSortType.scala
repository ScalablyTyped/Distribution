package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageSortType extends StObject {
  
  var parameters: QueryPerpageSortType
  
  var responses: `475`
}
object ParametersQueryPerpageSortType {
  
  inline def apply(parameters: QueryPerpageSortType, responses: `475`): ParametersQueryPerpageSortType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageSortType]
  }
  
  extension [Self <: ParametersQueryPerpageSortType](x: Self) {
    
    inline def setParameters(value: QueryPerpageSortType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `475`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
