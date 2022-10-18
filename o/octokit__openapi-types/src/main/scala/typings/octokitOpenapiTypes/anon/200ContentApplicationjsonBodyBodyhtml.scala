package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodyBodyhtml` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBodyBodyhtml
  
  var `403`: Content6
  
  var `422`: Content7
}
object `200ContentApplicationjsonBodyBodyhtml` {
  
  inline def apply(`200`: ContentApplicationjsonBodyBodyhtml, `403`: Content6, `422`: Content7): `200ContentApplicationjsonBodyBodyhtml` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodyBodyhtml`]
  }
  
  extension [Self <: `200ContentApplicationjsonBodyBodyhtml`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBodyBodyhtml): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content7): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
