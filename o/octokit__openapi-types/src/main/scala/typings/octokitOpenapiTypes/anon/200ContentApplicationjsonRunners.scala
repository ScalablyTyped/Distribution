package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRunners` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonRunners
}
object `200ContentApplicationjsonRunners` {
  
  inline def apply(`200`: ContentApplicationjsonRunners): `200ContentApplicationjsonRunners` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRunners`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRunners`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRunners): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
