package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonReposcount` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonReposcount
  
  var `403`: Content41
  
  var `422`: Content414
}
object `201ContentApplicationjsonReposcount` {
  
  inline def apply(`201`: ContentApplicationjsonReposcount, `403`: Content41, `422`: Content414): `201ContentApplicationjsonReposcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonReposcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonReposcount`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonReposcount): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
