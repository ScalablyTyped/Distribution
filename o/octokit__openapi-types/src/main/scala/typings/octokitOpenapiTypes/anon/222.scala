package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  /** @description Response */
  var `200`: Content220
}
object `222` {
  
  inline def apply(`200`: Content220): `222` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`222`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `222`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content220): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
