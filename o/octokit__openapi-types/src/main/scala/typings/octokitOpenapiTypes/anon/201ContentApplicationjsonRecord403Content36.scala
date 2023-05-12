package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonRecord403Content36` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonRecord
  
  var `403`: Content36
}
object `201ContentApplicationjsonRecord403Content36` {
  
  inline def apply(`201`: ContentApplicationjsonRecord, `403`: Content36): `201ContentApplicationjsonRecord403Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonRecord403Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonRecord403Content36`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonRecord): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
