package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOrderPagePerpageQ extends StObject {
  
  var parameters: QueryOrderPagePerpageQ
  
  var responses: `200ContentApplicationjsonItemsArrayTotalcountNumber`
}
object ParametersQueryOrderPagePerpageQ {
  
  inline def apply(
    parameters: QueryOrderPagePerpageQ,
    responses: `200ContentApplicationjsonItemsArrayTotalcountNumber`
  ): ParametersQueryOrderPagePerpageQ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOrderPagePerpageQ]
  }
  
  extension [Self <: ParametersQueryOrderPagePerpageQ](x: Self) {
    
    inline def setParameters(value: QueryOrderPagePerpageQ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonItemsArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
