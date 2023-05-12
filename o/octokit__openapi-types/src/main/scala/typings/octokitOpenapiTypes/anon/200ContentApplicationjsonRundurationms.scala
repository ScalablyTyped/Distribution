package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRundurationms` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonRundurationms
}
object `200ContentApplicationjsonRundurationms` {
  
  inline def apply(`200`: ContentApplicationjsonRundurationms): `200ContentApplicationjsonRundurationms` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRundurationms`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRundurationms`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRundurationms): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
