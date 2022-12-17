package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKey extends StObject {
  
  var parameters: PathKey
  
  var responses: `200304`
}
object ParametersPathKey {
  
  inline def apply(parameters: PathKey, responses: `200304`): ParametersPathKey = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKey]
  }
  
  extension [Self <: ParametersPathKey](x: Self) {
    
    inline def setParameters(value: PathKey): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
