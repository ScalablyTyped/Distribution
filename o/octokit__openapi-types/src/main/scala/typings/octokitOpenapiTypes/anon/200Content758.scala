package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content758` extends StObject {
  
  /** @description Response */
  var `200`: Content758
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200Content758` {
  
  inline def apply(`200`: Content758, `503`: ContentApplicationjsonCodeDocumentationurlMessage): `200Content758` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content758`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content758`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content758): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
