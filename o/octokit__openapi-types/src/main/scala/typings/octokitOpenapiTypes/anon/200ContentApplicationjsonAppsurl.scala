package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAppsurl` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonAppsurl
  
  var `404`: Content36
}
object `200ContentApplicationjsonAppsurl` {
  
  inline def apply(`200`: ContentApplicationjsonAppsurl, `404`: Content36): `200ContentApplicationjsonAppsurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAppsurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAppsurl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAppsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
