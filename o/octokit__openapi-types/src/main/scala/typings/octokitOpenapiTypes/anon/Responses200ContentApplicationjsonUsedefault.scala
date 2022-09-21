package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonUsedefault extends StObject {
  
  var parameters: `491`
  
  var responses: `200ContentApplicationjsonUsedefault`
}
object Responses200ContentApplicationjsonUsedefault {
  
  inline def apply(parameters: `491`, responses: `200ContentApplicationjsonUsedefault`): Responses200ContentApplicationjsonUsedefault = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonUsedefault]
  }
  
  extension [Self <: Responses200ContentApplicationjsonUsedefault](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonUsedefault`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
