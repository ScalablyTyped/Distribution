package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content426` extends StObject {
  
  /** Response */
  var `200`: Content426
  
  var `304`: Any
}
object `200Content426` {
  
  inline def apply(`200`: Content426, `304`: Any): `200Content426` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content426`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content426`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content426): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
