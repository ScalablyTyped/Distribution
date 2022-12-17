package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonReviewrequester` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonReviewrequester
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `410`: Content48
}
object `200ContentApplicationjsonReviewrequester` {
  
  inline def apply(`200`: ContentApplicationjsonReviewrequester, `403`: Content48, `404`: Content48, `410`: Content48): `200ContentApplicationjsonReviewrequester` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonReviewrequester`]
  }
  
  extension [Self <: `200ContentApplicationjsonReviewrequester`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonReviewrequester): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content48): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
