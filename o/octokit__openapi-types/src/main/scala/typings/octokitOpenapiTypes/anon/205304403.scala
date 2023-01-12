package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205304403` extends StObject {
  
  /** Reset Content */
  var `205`: Any
  
  var `304`: Any
  
  var `403`: Content48
}
object `205304403` {
  
  inline def apply(`205`: Any, `304`: Any, `403`: Content48): `205304403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("205")(`205`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`205304403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `205304403`] (val x: Self) extends AnyVal {
    
    inline def set205(value: Any): Self = StObject.set(x, "205", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
