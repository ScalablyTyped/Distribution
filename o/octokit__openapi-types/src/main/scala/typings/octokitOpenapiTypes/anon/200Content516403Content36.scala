package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content516403Content36` extends StObject {
  
  /** @description Response */
  var `200`: Content516
  
  var `403`: Content36
}
object `200Content516403Content36` {
  
  inline def apply(`200`: Content516, `403`: Content36): `200Content516403Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content516403Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content516403Content36`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content516): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
