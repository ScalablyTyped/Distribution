package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `299` extends StObject {
  
  /** @description Response */
  var `200`: `298`
}
object `299` {
  
  inline def apply(`200`: `298`): `299` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`299`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `299`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `298`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
