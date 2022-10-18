package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonSize` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonSize
  
  var `404`: Content6
  
  var `422`: Content8
}
object `200ContentApplicationjsonSize` {
  
  inline def apply(`200`: ContentApplicationjsonSize, `404`: Content6, `422`: Content8): `200ContentApplicationjsonSize` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonSize`]
  }
  
  extension [Self <: `200ContentApplicationjsonSize`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonSize): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
