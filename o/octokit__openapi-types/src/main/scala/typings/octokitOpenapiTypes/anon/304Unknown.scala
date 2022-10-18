package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `304Unknown` extends StObject {
  
  var `304`: Any
  
  var `403`: Content6
  
  /** Not Found if gist is not starred */
  var `404`: Content4
}
object `304Unknown` {
  
  inline def apply(`304`: Any, `403`: Content6, `404`: Content4): `304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`304Unknown`]
  }
  
  extension [Self <: `304Unknown`](x: Self) {
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content4): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
