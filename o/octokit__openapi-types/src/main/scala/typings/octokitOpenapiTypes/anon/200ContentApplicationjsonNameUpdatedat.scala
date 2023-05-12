package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNameUpdatedat` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonNameUpdatedat
}
object `200ContentApplicationjsonNameUpdatedat` {
  
  inline def apply(`200`: ContentApplicationjsonNameUpdatedat): `200ContentApplicationjsonNameUpdatedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNameUpdatedat`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonNameUpdatedat`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonNameUpdatedat): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
