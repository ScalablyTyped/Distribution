package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageRef extends StObject {
  
  var parameters: QueryPerpageRef
  
  var responses: `200Content181`
}
object ParametersQueryPerpageRef {
  
  inline def apply(parameters: QueryPerpageRef, responses: `200Content181`): ParametersQueryPerpageRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPerpageRef] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPerpageRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content181`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
