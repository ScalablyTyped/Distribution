package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content40404Content48` extends StObject {
  
  /** Response after successfully creaing a secret */
  var `201`: Content40
  
  var `404`: Content48
  
  var `422`: Content397
}
object `201Content40404Content48` {
  
  inline def apply(`201`: Content40, `404`: Content48, `422`: Content397): `201Content40404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content40404Content48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content40404Content48`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content40): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
