package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePermission extends StObject {
  
  var parameters: QueryPagePermission
  
  var responses: `200Content497`
}
object ParametersQueryPagePermission {
  
  inline def apply(parameters: QueryPagePermission, responses: `200Content497`): ParametersQueryPagePermission = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPagePermission] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPagePermission): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content497`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
