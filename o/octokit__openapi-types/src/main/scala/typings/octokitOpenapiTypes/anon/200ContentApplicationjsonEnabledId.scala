package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonEnabledId` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonEnabledId
}
object `200ContentApplicationjsonEnabledId` {
  
  inline def apply(`200`: ContentApplicationjsonEnabledId): `200ContentApplicationjsonEnabledId` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonEnabledId`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonEnabledId`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonEnabledId): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
