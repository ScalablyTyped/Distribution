package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonIncludeclaimkeys` extends StObject {
  
  /** A JSON serialized template for OIDC subject claim customization */
  var `200`: ContentApplicationjsonIncludeclaimkeys
}
object `200ContentApplicationjsonIncludeclaimkeys` {
  
  inline def apply(`200`: ContentApplicationjsonIncludeclaimkeys): `200ContentApplicationjsonIncludeclaimkeys` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonIncludeclaimkeys`]
  }
  
  extension [Self <: `200ContentApplicationjsonIncludeclaimkeys`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonIncludeclaimkeys): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
