package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content40403Content48404Content48` extends StObject {
  
  /** Response */
  var `201`: Content40
  
  var `403`: Content48
  
  var `404`: Content48
}
object `201Content40403Content48404Content48` {
  
  inline def apply(`201`: Content40, `403`: Content48, `404`: Content48): `201Content40403Content48404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content40403Content48404Content48`]
  }
  
  extension [Self <: `201Content40403Content48404Content48`](x: Self) {
    
    inline def set201(value: Content40): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
