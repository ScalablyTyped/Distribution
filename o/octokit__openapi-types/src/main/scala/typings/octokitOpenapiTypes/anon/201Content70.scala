package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content70` extends StObject {
  
  /** @description Response */
  var `201`: Content70
}
object `201Content70` {
  
  inline def apply(`201`: Content70): `201Content70` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content70`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content70`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content70): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
