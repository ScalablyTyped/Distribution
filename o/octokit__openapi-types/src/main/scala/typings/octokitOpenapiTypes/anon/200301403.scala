package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200301403` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDefaultbranch
  
  var `301`: Content55
  
  var `403`: Content55
  
  var `404`: Content55
}
object `200301403` {
  
  inline def apply(`200`: ContentApplicationjsonDefaultbranch, `301`: Content55, `403`: Content55, `404`: Content55): `200301403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200301403`]
  }
  
  extension [Self <: `200301403`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonDefaultbranch): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content55): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
