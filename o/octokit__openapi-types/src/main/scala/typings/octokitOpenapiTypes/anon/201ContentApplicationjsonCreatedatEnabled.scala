package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonCreatedatEnabled` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonCreatedatEnabled
  
  var `403`: Content55
  
  var `404`: Content55
}
object `201ContentApplicationjsonCreatedatEnabled` {
  
  inline def apply(`201`: ContentApplicationjsonCreatedatEnabled, `403`: Content55, `404`: Content55): `201ContentApplicationjsonCreatedatEnabled` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonCreatedatEnabled`]
  }
  
  extension [Self <: `201ContentApplicationjsonCreatedatEnabled`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonCreatedatEnabled): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
