package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content482Headers` extends StObject {
  
  /** Response */
  var `200`: Content482Headers
}
object `200Content482Headers` {
  
  inline def apply(`200`: Content482Headers): `200Content482Headers` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content482Headers`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content482Headers`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content482Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
