package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonTotalcountVariables` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonTotalcountVariables
}
object `200ContentApplicationjsonTotalcountVariables` {
  
  inline def apply(`200`: ContentApplicationjsonTotalcountVariables): `200ContentApplicationjsonTotalcountVariables` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonTotalcountVariables`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonTotalcountVariables`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonTotalcountVariables): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
