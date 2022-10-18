package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOwnerurl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOwnerurl
  
  /** Not Found if project is not managed by this team */
  var `404`: Any
}
object `200ContentApplicationjsonOwnerurl` {
  
  inline def apply(`200`: ContentApplicationjsonOwnerurl, `404`: Any): `200ContentApplicationjsonOwnerurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOwnerurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonOwnerurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonOwnerurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
