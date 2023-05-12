package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content598` extends StObject {
  
  /** @description Response */
  var `200`: Content598
  
  var `301`: Content36
  
  var `404`: Content36
  
  var `410`: Content36
}
object `200Content598` {
  
  inline def apply(`200`: Content598, `301`: Content36, `404`: Content36, `410`: Content36): `200Content598` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content598`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content598`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content598): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content36): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content36): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
