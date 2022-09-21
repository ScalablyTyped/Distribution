package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403Content592` extends StObject {
  
  var `304`: Any
  
  var `403`: Content592
  
  var `404`: Content592
}
object `403Content592` {
  
  inline def apply(`304`: Any, `403`: Content592, `404`: Content592): `403Content592` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403Content592`]
  }
  
  extension [Self <: `403Content592`](x: Self) {
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content592): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content592): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
