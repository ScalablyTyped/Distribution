package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content63` extends StObject {
  
  /** Response */
  var `200`: Content63
}
object `200Content63` {
  
  inline def apply(`200`: Content63): `200Content63` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content63`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content63`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content63): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
