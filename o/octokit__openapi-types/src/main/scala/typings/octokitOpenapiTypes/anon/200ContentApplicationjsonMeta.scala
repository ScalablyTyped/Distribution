package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonMeta` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonMeta
}
object `200ContentApplicationjsonMeta` {
  
  inline def apply(`200`: ContentApplicationjsonMeta): `200ContentApplicationjsonMeta` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonMeta`]
  }
  
  extension [Self <: `200ContentApplicationjsonMeta`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonMeta): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
