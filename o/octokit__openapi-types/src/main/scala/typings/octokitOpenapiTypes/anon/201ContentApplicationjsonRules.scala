package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonRules` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonRules
  
  var `404`: Content41
  
  var `500`: Content41
}
object `201ContentApplicationjsonRules` {
  
  inline def apply(`201`: ContentApplicationjsonRules, `404`: Content41, `500`: Content41): `201ContentApplicationjsonRules` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonRules`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonRules`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonRules): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content41): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
