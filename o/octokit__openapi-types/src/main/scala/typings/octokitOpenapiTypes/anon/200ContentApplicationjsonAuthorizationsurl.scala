package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAuthorizationsurl` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonAuthorizationsurl
}
object `200ContentApplicationjsonAuthorizationsurl` {
  
  inline def apply(`200`: ContentApplicationjsonAuthorizationsurl): `200ContentApplicationjsonAuthorizationsurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAuthorizationsurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAuthorizationsurl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAuthorizationsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
