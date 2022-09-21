package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonInstallationsTotalcount304Unknown` extends StObject {
  
  /** You can find the permissions for the installation under the `permissions` key. */
  var `200`: ContentApplicationjsonInstallationsTotalcount
  
  var `304`: Any
  
  var `401`: Content55
  
  var `403`: Content55
}
object `200ContentApplicationjsonInstallationsTotalcount304Unknown` {
  
  inline def apply(
    `200`: ContentApplicationjsonInstallationsTotalcount,
    `304`: Any,
    `401`: Content55,
    `403`: Content55
  ): `200ContentApplicationjsonInstallationsTotalcount304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonInstallationsTotalcount304Unknown`]
  }
  
  extension [Self <: `200ContentApplicationjsonInstallationsTotalcount304Unknown`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonInstallationsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content55): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
