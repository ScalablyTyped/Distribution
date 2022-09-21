package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQueryBeforeDirection extends StObject {
  
  var parameters: PathOwnerStringQueryBeforeDirection
  
  var responses: `200Content575`
}
object ParametersPathOwnerStringQueryBeforeDirection {
  
  inline def apply(parameters: PathOwnerStringQueryBeforeDirection, responses: `200Content575`): ParametersPathOwnerStringQueryBeforeDirection = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQueryBeforeDirection]
  }
  
  extension [Self <: ParametersPathOwnerStringQueryBeforeDirection](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQueryBeforeDirection): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content575`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
