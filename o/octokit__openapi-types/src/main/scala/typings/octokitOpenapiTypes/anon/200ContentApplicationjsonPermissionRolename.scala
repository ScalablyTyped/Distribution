package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonPermissionRolename` extends StObject {
  
  /** if user has admin permissions */
  var `200`: ContentApplicationjsonPermissionRolename
  
  var `404`: Content6
}
object `200ContentApplicationjsonPermissionRolename` {
  
  inline def apply(`200`: ContentApplicationjsonPermissionRolename, `404`: Content6): `200ContentApplicationjsonPermissionRolename` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonPermissionRolename`]
  }
  
  extension [Self <: `200ContentApplicationjsonPermissionRolename`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonPermissionRolename): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
