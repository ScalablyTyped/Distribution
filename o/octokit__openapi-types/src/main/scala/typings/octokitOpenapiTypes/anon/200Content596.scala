package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content596` extends StObject {
  
  /** @description Response */
  var `200`: Content596
  
  var `401`: Content41
  
  var `403`: Content41
}
object `200Content596` {
  
  inline def apply(`200`: Content596, `401`: Content41, `403`: Content41): `200Content596` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content596`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content596`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content596): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content41): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
