package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content718` extends StObject {
  
  /** @description Response */
  var `200`: Content718
  
  var `410`: Content41
}
object `200Content718` {
  
  inline def apply(`200`: Content718, `410`: Content41): `200Content718` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content718`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content718`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content718): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content41): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
