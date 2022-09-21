package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringResponses488 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `488`
}
object ParametersPathOwnerStringResponses488 {
  
  inline def apply(parameters: PathOwnerString, responses: `488`): ParametersPathOwnerStringResponses488 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringResponses488]
  }
  
  extension [Self <: ParametersPathOwnerStringResponses488](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `488`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
