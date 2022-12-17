package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202205304` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjsonMessage
  
  /** Reset Content */
  var `205`: Any
  
  var `304`: Any
  
  var `401`: Content48
  
  var `403`: Content48
}
object `202205304` {
  
  inline def apply(`202`: ContentApplicationjsonMessage, `205`: Any, `304`: Any, `401`: Content48, `403`: Content48): `202205304` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("205")(`205`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202205304`]
  }
  
  extension [Self <: `202205304`](x: Self) {
    
    inline def set202(value: ContentApplicationjsonMessage): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set205(value: Any): Self = StObject.set(x, "205", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
