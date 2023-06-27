package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `789` extends StObject {
  
  var responses: `200ContentApplicationjsonKeyKeyid`
}
object `789` {
  
  inline def apply(responses: `200ContentApplicationjsonKeyKeyid`): `789` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`789`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `789`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200ContentApplicationjsonKeyKeyid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
