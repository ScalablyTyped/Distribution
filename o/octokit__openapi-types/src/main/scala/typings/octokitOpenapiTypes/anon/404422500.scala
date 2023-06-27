package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404422500` extends StObject {
  
  /** @description Response */
  var `200`: Content581
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `422`: Content414
  
  var `500`: Content41
}
object `404422500` {
  
  inline def apply(`200`: Content581, `403`: Content41, `404`: Content41, `422`: Content414, `500`: Content41): `404422500` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404422500`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404422500`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content581): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content41): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
