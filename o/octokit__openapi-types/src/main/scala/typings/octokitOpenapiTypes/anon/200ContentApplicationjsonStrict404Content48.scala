package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonStrict404Content48` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonStrict
  
  var `404`: Content48
  
  var `422`: Content397
}
object `200ContentApplicationjsonStrict404Content48` {
  
  inline def apply(`200`: ContentApplicationjsonStrict, `404`: Content48, `422`: Content397): `200ContentApplicationjsonStrict404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonStrict404Content48`]
  }
  
  extension [Self <: `200ContentApplicationjsonStrict404Content48`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonStrict): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
