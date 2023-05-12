package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOrderPagePerpageQSort extends StObject {
  
  var parameters: QueryOrderPagePerpageQSort
  
  var responses: `200ContentApplicationjson644`
}
object ParametersQueryOrderPagePerpageQSort {
  
  inline def apply(parameters: QueryOrderPagePerpageQSort, responses: `200ContentApplicationjson644`): ParametersQueryOrderPagePerpageQSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOrderPagePerpageQSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryOrderPagePerpageQSort] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryOrderPagePerpageQSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson644`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
