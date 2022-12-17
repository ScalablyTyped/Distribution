package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `401403404410422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOwnerurl
  
  var `304`: Any
  
  var `401`: Content48
  
  /** Forbidden */
  var `403`: ContentApplicationjsonErrors
  
  /** Not Found if the authenticated user does not have access to the project */
  var `404`: Any
  
  var `410`: Content48
  
  var `422`: Content395
}
object `401403404410422` {
  
  inline def apply(
    `200`: ContentApplicationjsonOwnerurl,
    `304`: Any,
    `401`: Content48,
    `403`: ContentApplicationjsonErrors,
    `404`: Any,
    `410`: Content48,
    `422`: Content395
  ): `401403404410422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`401403404410422`]
  }
  
  extension [Self <: `401403404410422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonOwnerurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonErrors): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content48): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content395): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
