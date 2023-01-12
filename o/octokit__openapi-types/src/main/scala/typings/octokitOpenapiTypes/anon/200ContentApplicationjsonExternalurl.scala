package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonExternalurl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonExternalurl
}
object `200ContentApplicationjsonExternalurl` {
  
  inline def apply(`200`: ContentApplicationjsonExternalurl): `200ContentApplicationjsonExternalurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonExternalurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonExternalurl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonExternalurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
