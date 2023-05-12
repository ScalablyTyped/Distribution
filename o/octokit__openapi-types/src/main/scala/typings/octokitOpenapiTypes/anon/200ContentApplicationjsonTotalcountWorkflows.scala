package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonTotalcountWorkflows` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonTotalcountWorkflows
}
object `200ContentApplicationjsonTotalcountWorkflows` {
  
  inline def apply(`200`: ContentApplicationjsonTotalcountWorkflows): `200ContentApplicationjsonTotalcountWorkflows` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonTotalcountWorkflows`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonTotalcountWorkflows`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonTotalcountWorkflows): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
