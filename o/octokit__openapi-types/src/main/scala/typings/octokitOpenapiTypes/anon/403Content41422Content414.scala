package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403Content41422Content414` extends StObject {
  
  var `403`: Content41
  
  var `422`: Content414
}
object `403Content41422Content414` {
  
  inline def apply(`403`: Content41, `422`: Content414): `403Content41422Content414` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403Content41422Content414`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403Content41422Content414`] (val x: Self) extends AnyVal {
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
