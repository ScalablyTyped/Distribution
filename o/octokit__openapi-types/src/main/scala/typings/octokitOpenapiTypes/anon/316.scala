package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `316` extends StObject {
  
  /** @description Response */
  var `200`: Content96
}
object `316` {
  
  inline def apply(`200`: Content96): `316` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`316`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `316`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content96): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
