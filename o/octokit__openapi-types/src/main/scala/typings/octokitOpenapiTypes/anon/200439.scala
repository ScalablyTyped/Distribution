package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200439` extends StObject {
  
  /** Response */
  var `200`: `439`
  
  var `304`: Any
  
  var `403`: ContentApplicationjsonBlock
  
  var `404`: Content55
}
object `200439` {
  
  inline def apply(`200`: `439`, `304`: Any, `403`: ContentApplicationjsonBlock, `404`: Content55): `200439` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200439`]
  }
  
  extension [Self <: `200439`](x: Self) {
    
    inline def set200(value: `439`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonBlock): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
