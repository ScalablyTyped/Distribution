package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRef extends StObject {
  
  var parameters: PathOwnerRef
  
  var responses: `422500`
}
object ParametersPathOwnerRef {
  
  inline def apply(parameters: PathOwnerRef, responses: `422500`): ParametersPathOwnerRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRef]
  }
  
  extension [Self <: ParametersPathOwnerRef](x: Self) {
    
    inline def setParameters(value: PathOwnerRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
