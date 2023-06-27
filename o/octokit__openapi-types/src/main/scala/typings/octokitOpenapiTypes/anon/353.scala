package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `353` extends StObject {
  
  /** @description Response */
  var `200`: `352`
}
object `353` {
  
  inline def apply(`200`: `352`): `353` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`353`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `353`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `352`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
