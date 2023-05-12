package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjson505` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjson505
}
object `200ContentApplicationjson505` {
  
  inline def apply(`200`: ContentApplicationjson505): `200ContentApplicationjson505` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjson505`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjson505`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjson505): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
