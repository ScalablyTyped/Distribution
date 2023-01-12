package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonTotalcountNumber` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonTotalcountNumber
}
object `200ContentApplicationjsonTotalcountNumber` {
  
  inline def apply(`200`: ContentApplicationjsonTotalcountNumber): `200ContentApplicationjsonTotalcountNumber` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonTotalcountNumber`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonTotalcountNumber`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonTotalcountNumber): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
