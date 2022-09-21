package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOrganizationsTotalcount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOrganizationsTotalcount
}
object `200ContentApplicationjsonOrganizationsTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonOrganizationsTotalcount): `200ContentApplicationjsonOrganizationsTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOrganizationsTotalcount`]
  }
  
  extension [Self <: `200ContentApplicationjsonOrganizationsTotalcount`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonOrganizationsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
