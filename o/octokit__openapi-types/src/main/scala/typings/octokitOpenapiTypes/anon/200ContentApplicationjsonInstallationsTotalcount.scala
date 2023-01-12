package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonInstallationsTotalcount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonInstallationsTotalcount
}
object `200ContentApplicationjsonInstallationsTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonInstallationsTotalcount): `200ContentApplicationjsonInstallationsTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonInstallationsTotalcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonInstallationsTotalcount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonInstallationsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
