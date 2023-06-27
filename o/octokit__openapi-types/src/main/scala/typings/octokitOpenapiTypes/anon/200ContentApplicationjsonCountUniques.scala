package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCountUniques` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCountUniques
  
  var `403`: Content41
}
object `200ContentApplicationjsonCountUniques` {
  
  inline def apply(`200`: ContentApplicationjsonCountUniques, `403`: Content41): `200ContentApplicationjsonCountUniques` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCountUniques`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCountUniques`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCountUniques): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
