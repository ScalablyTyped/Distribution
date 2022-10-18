package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200403422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOrganizationurl
  
  var `403`: Content6
  
  var `422`: Content8
}
object `200403422` {
  
  inline def apply(`200`: ContentApplicationjsonOrganizationurl, `403`: Content6, `422`: Content8): `200403422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200403422`]
  }
  
  extension [Self <: `200403422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonOrganizationurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
