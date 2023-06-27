package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content634404Content41` extends StObject {
  
  /** @description Response */
  var `200`: Content634
  
  var `404`: Content41
}
object `200Content634404Content41` {
  
  inline def apply(`200`: Content634, `404`: Content41): `200Content634404Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content634404Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content634404Content41`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content634): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
