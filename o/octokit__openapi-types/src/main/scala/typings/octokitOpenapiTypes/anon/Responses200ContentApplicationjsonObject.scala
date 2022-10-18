package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonObject extends StObject {
  
  var parameters: `127`
  
  var responses: `200ContentApplicationjsonObject`
}
object Responses200ContentApplicationjsonObject {
  
  inline def apply(parameters: `127`, responses: `200ContentApplicationjsonObject`): Responses200ContentApplicationjsonObject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonObject]
  }
  
  extension [Self <: Responses200ContentApplicationjsonObject](x: Self) {
    
    inline def setParameters(value: `127`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonObject`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
