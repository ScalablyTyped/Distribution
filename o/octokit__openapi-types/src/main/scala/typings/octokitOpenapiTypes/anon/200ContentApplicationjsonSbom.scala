package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonSbom` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonSbom
  
  var `403`: Content41
  
  var `404`: Content41
}
object `200ContentApplicationjsonSbom` {
  
  inline def apply(`200`: ContentApplicationjsonSbom, `403`: Content41, `404`: Content41): `200ContentApplicationjsonSbom` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonSbom`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonSbom`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonSbom): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
