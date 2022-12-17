package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201401403` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonOwnerurl
  
  var `401`: Content48
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `410`: Content48
  
  var `422`: Content395
}
object `201401403` {
  
  inline def apply(
    `201`: ContentApplicationjsonOwnerurl,
    `401`: Content48,
    `403`: Content48,
    `404`: Content48,
    `410`: Content48,
    `422`: Content395
  ): `201401403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201401403`]
  }
  
  extension [Self <: `201401403`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonOwnerurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content48): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content395): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
