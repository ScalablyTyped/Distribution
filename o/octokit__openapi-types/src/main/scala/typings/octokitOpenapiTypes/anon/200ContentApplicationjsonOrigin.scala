package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOrigin` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonOrigin
  
  var `422`: Content414
}
object `200ContentApplicationjsonOrigin` {
  
  inline def apply(`200`: ContentApplicationjsonOrigin, `422`: Content414): `200ContentApplicationjsonOrigin` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOrigin`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonOrigin`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonOrigin): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
