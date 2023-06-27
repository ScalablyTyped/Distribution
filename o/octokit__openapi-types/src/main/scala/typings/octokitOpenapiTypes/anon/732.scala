package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `732` extends StObject {
  
  /** @description Response */
  var `200`: `731`
}
object `732` {
  
  inline def apply(`200`: `731`): `732` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`732`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `732`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `731`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
