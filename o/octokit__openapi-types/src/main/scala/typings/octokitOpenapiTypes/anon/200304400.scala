package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200304400` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationscimjsonItemsPerPageResources
  
  var `304`: Any
  
  var `400`: Content592
  
  var `403`: Content592
  
  var `404`: Content592
  
  var `429`: Content592
}
object `200304400` {
  
  inline def apply(
    `200`: ContentApplicationscimjsonItemsPerPageResources,
    `304`: Any,
    `400`: Content592,
    `403`: Content592,
    `404`: Content592,
    `429`: Content592
  ): `200304400` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("429")(`429`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200304400`]
  }
  
  extension [Self <: `200304400`](x: Self) {
    
    inline def set200(value: ContentApplicationscimjsonItemsPerPageResources): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set400(value: Content592): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content592): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content592): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set429(value: Content592): Self = StObject.set(x, "429", value.asInstanceOf[js.Any])
  }
}
