package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `651` extends StObject {
  
  var responses: `200ContentApplicationjsonKeyKeyid`
}
object `651` {
  
  inline def apply(responses: `200ContentApplicationjsonKeyKeyid`): `651` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`651`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `651`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200ContentApplicationjsonKeyKeyid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
