package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonPusher` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonPusher
}
object `200ContentApplicationjsonPusher` {
  
  inline def apply(`200`: ContentApplicationjsonPusher): `200ContentApplicationjsonPusher` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonPusher`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonPusher`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonPusher): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
