package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCreatedatIgnored` extends StObject {
  
  /** @description if you subscribe to the repository */
  var `200`: ContentApplicationjsonCreatedatIgnored
  
  var `403`: Content36
}
object `200ContentApplicationjsonCreatedatIgnored` {
  
  inline def apply(`200`: ContentApplicationjsonCreatedatIgnored, `403`: Content36): `200ContentApplicationjsonCreatedatIgnored` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCreatedatIgnored`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCreatedatIgnored`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCreatedatIgnored): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
