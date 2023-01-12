package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAll extends StObject {
  
  var parameters: QueryAll
  
  var responses: `200304401`
}
object ParametersQueryAll {
  
  inline def apply(parameters: QueryAll, responses: `200304401`): ParametersQueryAll = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAll] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAll): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
