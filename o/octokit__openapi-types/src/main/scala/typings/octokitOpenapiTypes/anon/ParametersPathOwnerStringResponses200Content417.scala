package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringResponses200Content417 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content417`
}
object ParametersPathOwnerStringResponses200Content417 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content417`): ParametersPathOwnerStringResponses200Content417 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringResponses200Content417]
  }
  
  extension [Self <: ParametersPathOwnerStringResponses200Content417](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content417`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
