package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjson595` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjson595
  
  var `304`: Any
}
object `200ContentApplicationjson595` {
  
  inline def apply(`200`: ContentApplicationjson595, `304`: Any): `200ContentApplicationjson595` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjson595`]
  }
  
  extension [Self <: `200ContentApplicationjson595`](x: Self) {
    
    inline def set200(value: ContentApplicationjson595): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
