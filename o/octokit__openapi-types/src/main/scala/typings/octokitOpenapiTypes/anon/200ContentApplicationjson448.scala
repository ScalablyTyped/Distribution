package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjson448` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjson448
}
object `200ContentApplicationjson448` {
  
  inline def apply(`200`: ContentApplicationjson448): `200ContentApplicationjson448` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjson448`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjson448`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjson448): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
