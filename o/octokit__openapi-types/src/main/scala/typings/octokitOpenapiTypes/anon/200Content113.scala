package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content113` extends StObject {
  
  /** Response */
  var `200`: Content113
  
  /** Response */
  var `201`: Content113
}
object `200Content113` {
  
  inline def apply(`200`: Content113, `201`: Content113): `200Content113` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content113`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content113`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content113): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: Content113): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
