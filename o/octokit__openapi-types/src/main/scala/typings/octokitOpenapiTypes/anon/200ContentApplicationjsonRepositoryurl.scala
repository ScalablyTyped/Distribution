package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRepositoryurl` extends StObject {
  
  /** if you subscribe to the repository */
  var `200`: ContentApplicationjsonRepositoryurl
  
  var `403`: Content6
  
  /** Not Found if you don't subscribe to the repository */
  var `404`: Any
}
object `200ContentApplicationjsonRepositoryurl` {
  
  inline def apply(`200`: ContentApplicationjsonRepositoryurl, `403`: Content6, `404`: Any): `200ContentApplicationjsonRepositoryurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRepositoryurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonRepositoryurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRepositoryurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
