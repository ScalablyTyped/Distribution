package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonRecord` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonRecord
  
  var `403`: Content36
  
  var `404`: Content36
}
object `201ContentApplicationjsonRecord` {
  
  inline def apply(`201`: ContentApplicationjsonRecord, `403`: Content36, `404`: Content36): `201ContentApplicationjsonRecord` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonRecord`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonRecord`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonRecord): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
