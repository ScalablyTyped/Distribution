package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRepositoryselectionTotalcount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRepositoryselectionTotalcount
  
  var `304`: Any
  
  var `401`: Content48
  
  var `403`: Content48
}
object `200ContentApplicationjsonRepositoryselectionTotalcount` {
  
  inline def apply(
    `200`: ContentApplicationjsonRepositoryselectionTotalcount,
    `304`: Any,
    `401`: Content48,
    `403`: Content48
  ): `200ContentApplicationjsonRepositoryselectionTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRepositoryselectionTotalcount`]
  }
  
  extension [Self <: `200ContentApplicationjsonRepositoryselectionTotalcount`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRepositoryselectionTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
