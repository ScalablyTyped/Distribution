package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionPagePerpageSort extends StObject {
  
  var parameters: QueryDirectionPagePerpageSort
  
  var responses: `200ContentApplicationjsonApplicationvndgithubv3starjson`
}
object ParametersQueryDirectionPagePerpageSort {
  
  inline def apply(
    parameters: QueryDirectionPagePerpageSort,
    responses: `200ContentApplicationjsonApplicationvndgithubv3starjson`
  ): ParametersQueryDirectionPagePerpageSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionPagePerpageSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryDirectionPagePerpageSort] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryDirectionPagePerpageSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonApplicationvndgithubv3starjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
