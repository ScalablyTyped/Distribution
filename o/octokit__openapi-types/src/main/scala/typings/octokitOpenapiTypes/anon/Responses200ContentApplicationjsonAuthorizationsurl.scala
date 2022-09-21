package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonAuthorizationsurl extends StObject {
  
  var responses: `200ContentApplicationjsonAuthorizationsurl`
}
object Responses200ContentApplicationjsonAuthorizationsurl {
  
  inline def apply(responses: `200ContentApplicationjsonAuthorizationsurl`): Responses200ContentApplicationjsonAuthorizationsurl = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonAuthorizationsurl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonAuthorizationsurl](x: Self) {
    
    inline def setResponses(value: `200ContentApplicationjsonAuthorizationsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
