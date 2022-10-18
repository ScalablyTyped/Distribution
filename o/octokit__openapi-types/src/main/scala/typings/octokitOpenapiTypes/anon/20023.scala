package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20023` extends StObject {
  
  /** Response */
  var `200`: `23`
  
  var `304`: Any
  
  var `403`: ContentApplicationjsonBlock
  
  var `404`: Content6
}
object `20023` {
  
  inline def apply(`200`: `23`, `304`: Any, `403`: ContentApplicationjsonBlock, `404`: Content6): `20023` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20023`]
  }
  
  extension [Self <: `20023`](x: Self) {
    
    inline def set200(value: `23`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonBlock): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
