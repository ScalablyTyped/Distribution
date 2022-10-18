package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCreatedatId` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCreatedatId
  
  var `304`: Any
  
  var `401`: Content6
  
  var `403`: Content6
  
  var `404`: Content6
}
object `200ContentApplicationjsonCreatedatId` {
  
  inline def apply(
    `200`: ContentApplicationjsonCreatedatId,
    `304`: Any,
    `401`: Content6,
    `403`: Content6,
    `404`: Content6
  ): `200ContentApplicationjsonCreatedatId` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCreatedatId`]
  }
  
  extension [Self <: `200ContentApplicationjsonCreatedatId`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCreatedatId): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
