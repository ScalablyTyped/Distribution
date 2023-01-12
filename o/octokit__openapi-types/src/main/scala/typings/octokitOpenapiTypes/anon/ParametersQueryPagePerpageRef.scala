package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageRef extends StObject {
  
  var parameters: QueryPagePerpageRef
  
  var responses: `200Content493`
}
object ParametersQueryPagePerpageRef {
  
  inline def apply(parameters: QueryPagePerpageRef, responses: `200Content493`): ParametersQueryPagePerpageRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPagePerpageRef] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPagePerpageRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content493`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
