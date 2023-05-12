package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonContenttype` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonContenttype
}
object `200ContentApplicationjsonContenttype` {
  
  inline def apply(`200`: ContentApplicationjsonContenttype): `200ContentApplicationjsonContenttype` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonContenttype`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonContenttype`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonContenttype): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
