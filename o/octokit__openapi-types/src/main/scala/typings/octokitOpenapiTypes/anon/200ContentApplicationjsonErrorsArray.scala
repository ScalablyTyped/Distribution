package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonErrorsArray` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonErrorsArray
}
object `200ContentApplicationjsonErrorsArray` {
  
  inline def apply(`200`: ContentApplicationjsonErrorsArray): `200ContentApplicationjsonErrorsArray` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonErrorsArray`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonErrorsArray`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonErrorsArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
