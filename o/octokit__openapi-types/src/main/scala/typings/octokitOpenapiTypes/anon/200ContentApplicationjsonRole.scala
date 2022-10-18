package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRole` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRole
  
  /** if user has no team membership */
  var `404`: Any
}
object `200ContentApplicationjsonRole` {
  
  inline def apply(`200`: ContentApplicationjsonRole, `404`: Any): `200ContentApplicationjsonRole` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRole`]
  }
  
  extension [Self <: `200ContentApplicationjsonRole`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRole): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
