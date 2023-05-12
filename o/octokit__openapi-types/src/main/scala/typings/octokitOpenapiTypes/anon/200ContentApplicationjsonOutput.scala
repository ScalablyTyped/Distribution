package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOutput` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonOutput
}
object `200ContentApplicationjsonOutput` {
  
  inline def apply(`200`: ContentApplicationjsonOutput): `200ContentApplicationjsonOutput` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOutput`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonOutput`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonOutput): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
