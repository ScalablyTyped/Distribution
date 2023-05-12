package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonUpdatedatValue` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonUpdatedatValue
}
object `200ContentApplicationjsonUpdatedatValue` {
  
  inline def apply(`200`: ContentApplicationjsonUpdatedatValue): `200ContentApplicationjsonUpdatedatValue` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonUpdatedatValue`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonUpdatedatValue`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonUpdatedatValue): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
