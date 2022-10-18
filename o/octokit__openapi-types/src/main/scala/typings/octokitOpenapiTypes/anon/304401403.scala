package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `304401403` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonSubject
  
  var `304`: Any
  
  var `401`: Content6
  
  var `403`: Content6
}
object `304401403` {
  
  inline def apply(`200`: ContentApplicationjsonSubject, `304`: Any, `401`: Content6, `403`: Content6): `304401403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`304401403`]
  }
  
  extension [Self <: `304401403`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonSubject): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
