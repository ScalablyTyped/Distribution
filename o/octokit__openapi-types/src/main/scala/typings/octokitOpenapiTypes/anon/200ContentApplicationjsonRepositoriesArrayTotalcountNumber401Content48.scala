package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRepositoriesArrayTotalcountNumber
  
  var `401`: Content48
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `500`: Content48
}
object `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48` {
  
  inline def apply(
    `200`: ContentApplicationjsonRepositoriesArrayTotalcountNumber,
    `401`: Content48,
    `403`: Content48,
    `404`: Content48,
    `500`: Content48
  ): `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48`]
  }
  
  extension [Self <: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRepositoriesArrayTotalcountNumber): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content48): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
