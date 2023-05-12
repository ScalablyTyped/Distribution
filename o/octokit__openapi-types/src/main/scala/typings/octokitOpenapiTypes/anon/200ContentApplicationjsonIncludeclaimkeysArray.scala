package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonIncludeclaimkeysArray` extends StObject {
  
  /** @description A JSON serialized template for OIDC subject claim customization */
  var `200`: ContentApplicationjsonIncludeclaimkeysArray
}
object `200ContentApplicationjsonIncludeclaimkeysArray` {
  
  inline def apply(`200`: ContentApplicationjsonIncludeclaimkeysArray): `200ContentApplicationjsonIncludeclaimkeysArray` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonIncludeclaimkeysArray`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonIncludeclaimkeysArray`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonIncludeclaimkeysArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
