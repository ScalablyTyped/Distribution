package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonCreatedatId` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonCreatedatId
  
  var `304`: Any
  
  var `401`: Content6
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `422`: Content8
}
object `201ContentApplicationjsonCreatedatId` {
  
  inline def apply(
    `201`: ContentApplicationjsonCreatedatId,
    `304`: Any,
    `401`: Content6,
    `403`: Content6,
    `404`: Content6,
    `422`: Content8
  ): `201ContentApplicationjsonCreatedatId` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonCreatedatId`]
  }
  
  extension [Self <: `201ContentApplicationjsonCreatedatId`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonCreatedatId): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
