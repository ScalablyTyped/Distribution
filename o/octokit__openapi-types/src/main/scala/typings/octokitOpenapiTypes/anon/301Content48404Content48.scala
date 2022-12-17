package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301Content48404Content48` extends StObject {
  
  var `301`: Content48
  
  var `404`: Content48
  
  var `410`: Content48
}
object `301Content48404Content48` {
  
  inline def apply(`301`: Content48, `404`: Content48, `410`: Content48): `301Content48404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301Content48404Content48`]
  }
  
  extension [Self <: `301Content48404Content48`](x: Self) {
    
    inline def set301(value: Content48): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content48): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
