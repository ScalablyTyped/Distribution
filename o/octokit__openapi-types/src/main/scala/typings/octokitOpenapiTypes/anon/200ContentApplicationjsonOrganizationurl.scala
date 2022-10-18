package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOrganizationurl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOrganizationurl
  
  var `403`: Content6
  
  var `404`: Content6
}
object `200ContentApplicationjsonOrganizationurl` {
  
  inline def apply(`200`: ContentApplicationjsonOrganizationurl, `403`: Content6, `404`: Content6): `200ContentApplicationjsonOrganizationurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOrganizationurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonOrganizationurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonOrganizationurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
