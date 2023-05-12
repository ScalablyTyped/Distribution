package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200558` extends StObject {
  
  /** @description Response */
  var `200`: `558`
  
  var `404`: Content36
}
object `200558` {
  
  inline def apply(`200`: `558`, `404`: Content36): `200558` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200558`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200558`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `558`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
