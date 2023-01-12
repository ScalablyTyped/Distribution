package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonContenttype extends StObject {
  
  var responses: `200ContentApplicationjsonContenttype`
}
object Responses200ContentApplicationjsonContenttype {
  
  inline def apply(responses: `200ContentApplicationjsonContenttype`): Responses200ContentApplicationjsonContenttype = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonContenttype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonContenttype] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200ContentApplicationjsonContenttype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
