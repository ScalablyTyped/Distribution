package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content152Headers` extends StObject {
  
  /** Response */
  var `200`: Content152Headers
}
object `200Content152Headers` {
  
  inline def apply(`200`: Content152Headers): `200Content152Headers` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content152Headers`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content152Headers`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content152Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
