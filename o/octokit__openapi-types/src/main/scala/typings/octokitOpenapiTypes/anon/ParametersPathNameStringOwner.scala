package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOwner extends StObject {
  
  var parameters: PathNameStringOwner
  
  var responses: `200540`
}
object ParametersPathNameStringOwner {
  
  inline def apply(parameters: PathNameStringOwner, responses: `200540`): ParametersPathNameStringOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOwner]
  }
  
  extension [Self <: ParametersPathNameStringOwner](x: Self) {
    
    inline def setParameters(value: PathNameStringOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200540`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
