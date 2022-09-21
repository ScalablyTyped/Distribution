package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `304400403` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationscimjsonActiveDisplayName
  
  var `304`: Any
  
  var `400`: Content592
  
  var `403`: Content592
  
  var `404`: Content592
  
  var `409`: Content592
  
  var `500`: Content592
}
object `304400403` {
  
  inline def apply(
    `201`: ContentApplicationscimjsonActiveDisplayName,
    `304`: Any,
    `400`: Content592,
    `403`: Content592,
    `404`: Content592,
    `409`: Content592,
    `500`: Content592
  ): `304400403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`304400403`]
  }
  
  extension [Self <: `304400403`](x: Self) {
    
    inline def set201(value: ContentApplicationscimjsonActiveDisplayName): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set400(value: Content592): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content592): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content592): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content592): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content592): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
