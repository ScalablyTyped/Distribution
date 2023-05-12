package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonVariables` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonVariables
}
object `200ContentApplicationjsonVariables` {
  
  inline def apply(`200`: ContentApplicationjsonVariables): `200ContentApplicationjsonVariables` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonVariables`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonVariables`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonVariables): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
