package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySortType extends StObject {
  
  var parameters: QuerySortType
  
  var responses: `109`
}
object ParametersQuerySortType {
  
  inline def apply(parameters: QuerySortType, responses: `109`): ParametersQuerySortType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySortType]
  }
  
  extension [Self <: ParametersQuerySortType](x: Self) {
    
    inline def setParameters(value: QuerySortType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `109`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
