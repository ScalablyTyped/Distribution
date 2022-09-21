package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerString extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200301304`
}
object ParametersPathOwnerString {
  
  inline def apply(parameters: PathOwnerString, responses: `200301304`): ParametersPathOwnerString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerString]
  }
  
  extension [Self <: ParametersPathOwnerString](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
