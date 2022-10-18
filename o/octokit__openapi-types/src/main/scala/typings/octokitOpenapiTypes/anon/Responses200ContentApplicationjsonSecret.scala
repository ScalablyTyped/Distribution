package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSecret extends StObject {
  
  var responses: `200ContentApplicationjsonSecret`
}
object Responses200ContentApplicationjsonSecret {
  
  inline def apply(responses: `200ContentApplicationjsonSecret`): Responses200ContentApplicationjsonSecret = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSecret]
  }
  
  extension [Self <: Responses200ContentApplicationjsonSecret](x: Self) {
    
    inline def setResponses(value: `200ContentApplicationjsonSecret`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
