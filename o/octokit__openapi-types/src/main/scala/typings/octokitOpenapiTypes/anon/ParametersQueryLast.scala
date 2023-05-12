package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryLast extends StObject {
  
  var parameters: QueryLast
  
  var responses: `200304400403`
}
object ParametersQueryLast {
  
  inline def apply(parameters: QueryLast, responses: `200304400403`): ParametersQueryLast = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryLast]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryLast] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryLast): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
