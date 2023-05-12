package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAccesslevel` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonAccesslevel
}
object `200ContentApplicationjsonAccesslevel` {
  
  inline def apply(`200`: ContentApplicationjsonAccesslevel): `200ContentApplicationjsonAccesslevel` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAccesslevel`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAccesslevel`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAccesslevel): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
