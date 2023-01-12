package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBadgeurl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBadgeurl
}
object `200ContentApplicationjsonBadgeurl` {
  
  inline def apply(`200`: ContentApplicationjsonBadgeurl): `200ContentApplicationjsonBadgeurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBadgeurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonBadgeurl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBadgeurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
