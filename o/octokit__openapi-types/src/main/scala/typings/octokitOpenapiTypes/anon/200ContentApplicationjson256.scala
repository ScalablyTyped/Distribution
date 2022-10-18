package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjson256` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjson256
}
object `200ContentApplicationjson256` {
  
  inline def apply(`200`: ContentApplicationjson256): `200ContentApplicationjson256` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjson256`]
  }
  
  extension [Self <: `200ContentApplicationjson256`](x: Self) {
    
    inline def set200(value: ContentApplicationjson256): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
