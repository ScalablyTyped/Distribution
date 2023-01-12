package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBillingemail` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBillingemail
  
  var `404`: Content48
}
object `200ContentApplicationjsonBillingemail` {
  
  inline def apply(`200`: ContentApplicationjsonBillingemail, `404`: Content48): `200ContentApplicationjsonBillingemail` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBillingemail`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonBillingemail`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBillingemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
