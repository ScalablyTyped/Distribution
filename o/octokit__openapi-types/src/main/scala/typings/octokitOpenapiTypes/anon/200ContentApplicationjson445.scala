package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjson445` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjson445
  
  var `404`: Content36
  
  var `422`: Content346
}
object `200ContentApplicationjson445` {
  
  inline def apply(`200`: ContentApplicationjson445, `404`: Content36, `422`: Content346): `200ContentApplicationjson445` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjson445`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjson445`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjson445): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
