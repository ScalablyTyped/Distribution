package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `609` extends StObject {
  
  /** @description Response */
  var `200`: `608`
}
object `609` {
  
  inline def apply(`200`: `608`): `609` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`609`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `609`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `608`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
