package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content772` extends StObject {
  
  /** @description Response */
  var `200`: Content772
  
  var `403`: Content41
}
object `200Content772` {
  
  inline def apply(`200`: Content772, `403`: Content41): `200Content772` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content772`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content772`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content772): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
