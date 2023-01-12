package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageSortType extends StObject {
  
  var parameters: QueryPagePerpageSortType
  
  var responses: `459`
}
object ParametersQueryPagePerpageSortType {
  
  inline def apply(parameters: QueryPagePerpageSortType, responses: `459`): ParametersQueryPagePerpageSortType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageSortType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPagePerpageSortType] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPagePerpageSortType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `459`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
