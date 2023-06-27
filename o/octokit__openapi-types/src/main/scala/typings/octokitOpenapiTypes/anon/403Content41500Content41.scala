package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403Content41500Content41` extends StObject {
  
  var `403`: Content41
  
  var `500`: Content41
}
object `403Content41500Content41` {
  
  inline def apply(`403`: Content41, `500`: Content41): `403Content41500Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403Content41500Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403Content41500Content41`] (val x: Self) extends AnyVal {
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content41): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
