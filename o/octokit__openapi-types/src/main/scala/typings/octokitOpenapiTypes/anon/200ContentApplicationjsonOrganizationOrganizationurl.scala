package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOrganizationOrganizationurl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOrganizationOrganizationurl
  
  var `403`: Content55
  
  var `404`: Content55
}
object `200ContentApplicationjsonOrganizationOrganizationurl` {
  
  inline def apply(`200`: ContentApplicationjsonOrganizationOrganizationurl, `403`: Content55, `404`: Content55): `200ContentApplicationjsonOrganizationOrganizationurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOrganizationOrganizationurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonOrganizationOrganizationurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonOrganizationOrganizationurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
