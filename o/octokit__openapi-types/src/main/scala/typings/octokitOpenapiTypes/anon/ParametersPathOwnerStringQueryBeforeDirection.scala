package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQueryBeforeDirection extends StObject {
  
  var parameters: PathOwnerStringQueryBeforeDirection
  
  var responses: `200Content626`
}
object ParametersPathOwnerStringQueryBeforeDirection {
  
  inline def apply(parameters: PathOwnerStringQueryBeforeDirection, responses: `200Content626`): ParametersPathOwnerStringQueryBeforeDirection = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQueryBeforeDirection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQueryBeforeDirection] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQueryBeforeDirection): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content626`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
