package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonPattern` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonPattern
  
  var `403`: Content6
  
  var `404`: Content6
}
object `201ContentApplicationjsonPattern` {
  
  inline def apply(`201`: ContentApplicationjsonPattern, `403`: Content6, `404`: Content6): `201ContentApplicationjsonPattern` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonPattern`]
  }
  
  extension [Self <: `201ContentApplicationjsonPattern`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonPattern): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
