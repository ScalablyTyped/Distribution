package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodyBodyhtml422Content7` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBodyBodyhtml
  
  var `422`: Content7
}
object `200ContentApplicationjsonBodyBodyhtml422Content7` {
  
  inline def apply(`200`: ContentApplicationjsonBodyBodyhtml, `422`: Content7): `200ContentApplicationjsonBodyBodyhtml422Content7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodyBodyhtml422Content7`]
  }
  
  extension [Self <: `200ContentApplicationjsonBodyBodyhtml422Content7`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBodyBodyhtml): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content7): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
