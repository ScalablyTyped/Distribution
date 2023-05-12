package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403Content36500Content36` extends StObject {
  
  var `403`: Content36
  
  var `500`: Content36
}
object `403Content36500Content36` {
  
  inline def apply(`403`: Content36, `500`: Content36): `403Content36500Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403Content36500Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403Content36500Content36`] (val x: Self) extends AnyVal {
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content36): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
