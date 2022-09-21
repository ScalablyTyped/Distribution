package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonChecksuites` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonChecksuites
}
object `200ContentApplicationjsonChecksuites` {
  
  inline def apply(`200`: ContentApplicationjsonChecksuites): `200ContentApplicationjsonChecksuites` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonChecksuites`]
  }
  
  extension [Self <: `200ContentApplicationjsonChecksuites`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonChecksuites): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
