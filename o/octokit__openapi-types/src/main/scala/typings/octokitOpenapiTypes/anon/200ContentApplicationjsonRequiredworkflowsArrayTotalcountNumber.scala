package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRequiredworkflowsArrayTotalcountNumber` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonRequiredworkflowsArrayTotalcountNumber
  
  var `404`: Content41
}
object `200ContentApplicationjsonRequiredworkflowsArrayTotalcountNumber` {
  
  inline def apply(`200`: ContentApplicationjsonRequiredworkflowsArrayTotalcountNumber, `404`: Content41): `200ContentApplicationjsonRequiredworkflowsArrayTotalcountNumber` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRequiredworkflowsArrayTotalcountNumber`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRequiredworkflowsArrayTotalcountNumber`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRequiredworkflowsArrayTotalcountNumber): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
