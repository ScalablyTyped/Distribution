package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonVariablesArray` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonVariablesArray
}
object `200ContentApplicationjsonVariablesArray` {
  
  inline def apply(`200`: ContentApplicationjsonVariablesArray): `200ContentApplicationjsonVariablesArray` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonVariablesArray`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonVariablesArray`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonVariablesArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
