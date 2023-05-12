package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonInstallations` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonInstallations
}
object `200ContentApplicationjsonInstallations` {
  
  inline def apply(`200`: ContentApplicationjsonInstallations): `200ContentApplicationjsonInstallations` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonInstallations`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonInstallations`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonInstallations): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
