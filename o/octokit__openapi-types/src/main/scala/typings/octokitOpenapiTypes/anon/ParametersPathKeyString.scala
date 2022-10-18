package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyString extends StObject {
  
  var parameters: PathKeyString
  
  var responses: `200304`
}
object ParametersPathKeyString {
  
  inline def apply(parameters: PathKeyString, responses: `200304`): ParametersPathKeyString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyString]
  }
  
  extension [Self <: ParametersPathKeyString](x: Self) {
    
    inline def setParameters(value: PathKeyString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
