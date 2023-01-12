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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonOrganizationsTotalcount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonOrganizationsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
