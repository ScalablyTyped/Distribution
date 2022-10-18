package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAll` extends StObject {
  
  /** The array order is oldest week (index 0) to most recent week. */
  var `200`: ContentApplicationjsonAll
  
  var `404`: Content6
}
object `200ContentApplicationjsonAll` {
  
  inline def apply(`200`: ContentApplicationjsonAll, `404`: Content6): `200ContentApplicationjsonAll` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAll`]
  }
  
  extension [Self <: `200ContentApplicationjsonAll`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAll): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
