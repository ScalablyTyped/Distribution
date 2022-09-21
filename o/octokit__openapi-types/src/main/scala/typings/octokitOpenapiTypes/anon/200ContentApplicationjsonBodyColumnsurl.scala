package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodyColumnsurl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBodyColumnsurl
  
  /** Not Found if project is not managed by this team */
  var `404`: Any
}
object `200ContentApplicationjsonBodyColumnsurl` {
  
  inline def apply(`200`: ContentApplicationjsonBodyColumnsurl, `404`: Any): `200ContentApplicationjsonBodyColumnsurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodyColumnsurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonBodyColumnsurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBodyColumnsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
