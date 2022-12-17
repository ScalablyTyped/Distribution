package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonMergecommitsha` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonMergecommitsha
  
  var `422`: Content397
}
object `200ContentApplicationjsonMergecommitsha` {
  
  inline def apply(`200`: ContentApplicationjsonMergecommitsha, `422`: Content397): `200ContentApplicationjsonMergecommitsha` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonMergecommitsha`]
  }
  
  extension [Self <: `200ContentApplicationjsonMergecommitsha`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonMergecommitsha): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
