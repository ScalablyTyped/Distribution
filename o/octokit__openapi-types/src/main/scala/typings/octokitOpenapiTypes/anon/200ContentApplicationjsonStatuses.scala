package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonStatuses` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonStatuses
  
  var `404`: Content48
}
object `200ContentApplicationjsonStatuses` {
  
  inline def apply(`200`: ContentApplicationjsonStatuses, `404`: Content48): `200ContentApplicationjsonStatuses` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonStatuses`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonStatuses`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonStatuses): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
