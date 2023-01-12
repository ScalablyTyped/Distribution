package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content394` extends StObject {
  
  /** Response */
  var `201`: Content394
  
  var `404`: Content48
  
  var `422`: Content395
}
object `201Content394` {
  
  inline def apply(`201`: Content394, `404`: Content48, `422`: Content395): `201Content394` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content394`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content394`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content394): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content395): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
