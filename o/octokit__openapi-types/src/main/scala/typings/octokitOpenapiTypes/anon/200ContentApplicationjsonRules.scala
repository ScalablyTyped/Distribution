package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRules` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonRules
  
  var `404`: Content36
  
  var `500`: Content36
}
object `200ContentApplicationjsonRules` {
  
  inline def apply(`200`: ContentApplicationjsonRules, `404`: Content36, `500`: Content36): `200ContentApplicationjsonRules` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRules`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRules`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRules): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content36): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
