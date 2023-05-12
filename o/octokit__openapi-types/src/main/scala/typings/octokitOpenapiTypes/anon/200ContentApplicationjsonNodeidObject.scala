package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNodeidObject` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonNodeidObject
  
  var `404`: Content36
}
object `200ContentApplicationjsonNodeidObject` {
  
  inline def apply(`200`: ContentApplicationjsonNodeidObject, `404`: Content36): `200ContentApplicationjsonNodeidObject` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNodeidObject`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonNodeidObject`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonNodeidObject): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
