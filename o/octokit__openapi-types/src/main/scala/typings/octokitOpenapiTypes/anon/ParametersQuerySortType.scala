package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySortType extends StObject {
  
  var parameters: QuerySortType
  
  var responses: `101`
}
object ParametersQuerySortType {
  
  inline def apply(parameters: QuerySortType, responses: `101`): ParametersQuerySortType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySortType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySortType] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySortType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `101`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
