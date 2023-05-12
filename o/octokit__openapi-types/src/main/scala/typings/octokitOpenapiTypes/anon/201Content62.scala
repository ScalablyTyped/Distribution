package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content62` extends StObject {
  
  /** @description Response */
  var `201`: Content62
}
object `201Content62` {
  
  inline def apply(`201`: Content62): `201Content62` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content62`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content62`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content62): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
