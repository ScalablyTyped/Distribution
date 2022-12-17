package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `500Content48` extends StObject {
  
  var `403`: Content48
  
  var `500`: Content48
}
object `500Content48` {
  
  inline def apply(`403`: Content48, `500`: Content48): `500Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`500Content48`]
  }
  
  extension [Self <: `500Content48`](x: Self) {
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content48): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
