package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringResponses200Content435 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content435`
}
object ParametersPathOwnerStringResponses200Content435 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content435`): ParametersPathOwnerStringResponses200Content435 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringResponses200Content435]
  }
  
  extension [Self <: ParametersPathOwnerStringResponses200Content435](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content435`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
