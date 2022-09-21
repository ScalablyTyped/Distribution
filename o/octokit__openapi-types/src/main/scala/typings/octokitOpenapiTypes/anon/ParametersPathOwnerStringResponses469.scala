package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringResponses469 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `469`
}
object ParametersPathOwnerStringResponses469 {
  
  inline def apply(parameters: PathOwnerString, responses: `469`): ParametersPathOwnerStringResponses469 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringResponses469]
  }
  
  extension [Self <: ParametersPathOwnerStringResponses469](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `469`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
