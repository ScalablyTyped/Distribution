package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCreatedatIgnored` extends StObject {
  
  /** if you subscribe to the repository */
  var `200`: ContentApplicationjsonCreatedatIgnored
  
  var `403`: Content48
  
  /** Not Found if you don't subscribe to the repository */
  var `404`: Any
}
object `200ContentApplicationjsonCreatedatIgnored` {
  
  inline def apply(`200`: ContentApplicationjsonCreatedatIgnored, `403`: Content48, `404`: Any): `200ContentApplicationjsonCreatedatIgnored` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCreatedatIgnored`]
  }
  
  extension [Self <: `200ContentApplicationjsonCreatedatIgnored`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCreatedatIgnored): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
