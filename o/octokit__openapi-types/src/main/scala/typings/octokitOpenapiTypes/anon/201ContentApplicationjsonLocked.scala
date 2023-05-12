package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonLocked` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonLocked
  
  var `403`: Content36
  
  var `422`: Content346
}
object `201ContentApplicationjsonLocked` {
  
  inline def apply(`201`: ContentApplicationjsonLocked, `403`: Content36, `422`: Content346): `201ContentApplicationjsonLocked` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonLocked`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonLocked`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonLocked): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
