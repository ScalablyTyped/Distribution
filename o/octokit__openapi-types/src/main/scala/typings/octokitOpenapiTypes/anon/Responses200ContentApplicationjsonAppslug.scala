package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAppslug extends StObject {
  
  var parameters: `37`
  
  var responses: `200ContentApplicationjsonAppslug`
}
object Responses200ContentApplicationjsonAppslug {
  
  inline def apply(parameters: `37`, responses: `200ContentApplicationjsonAppslug`): Responses200ContentApplicationjsonAppslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAppslug]
  }
  
  extension [Self <: Responses200ContentApplicationjsonAppslug](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAppslug`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
