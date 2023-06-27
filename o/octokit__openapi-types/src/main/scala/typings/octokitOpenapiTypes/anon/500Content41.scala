package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `500Content41` extends StObject {
  
  var `404`: Content41
  
  var `500`: Content41
}
object `500Content41` {
  
  inline def apply(`404`: Content41, `500`: Content41): `500Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`500Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `500Content41`] (val x: Self) extends AnyVal {
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content41): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
