package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNames404Content41` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonNames
  
  var `404`: Content41
  
  var `422`: Content549
}
object `200ContentApplicationjsonNames404Content41` {
  
  inline def apply(`200`: ContentApplicationjsonNames, `404`: Content41, `422`: Content549): `200ContentApplicationjsonNames404Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNames404Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonNames404Content41`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonNames): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
