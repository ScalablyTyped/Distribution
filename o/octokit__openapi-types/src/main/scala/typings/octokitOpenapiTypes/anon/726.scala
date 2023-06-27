package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `726` extends StObject {
  
  /** @description Response */
  var `200`: `725`
}
object `726` {
  
  inline def apply(`200`: `725`): `726` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`726`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `726`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `725`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
