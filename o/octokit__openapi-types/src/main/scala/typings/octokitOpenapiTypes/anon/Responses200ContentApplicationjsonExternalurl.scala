package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonExternalurl extends StObject {
  
  var responses: `200ContentApplicationjsonExternalurl`
}
object Responses200ContentApplicationjsonExternalurl {
  
  inline def apply(responses: `200ContentApplicationjsonExternalurl`): Responses200ContentApplicationjsonExternalurl = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonExternalurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonExternalurl] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200ContentApplicationjsonExternalurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
