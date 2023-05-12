package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNodeidObject422Content346` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonNodeidObject
  
  var `422`: Content346
}
object `200ContentApplicationjsonNodeidObject422Content346` {
  
  inline def apply(`200`: ContentApplicationjsonNodeidObject, `422`: Content346): `200ContentApplicationjsonNodeidObject422Content346` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNodeidObject422Content346`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonNodeidObject422Content346`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonNodeidObject): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
