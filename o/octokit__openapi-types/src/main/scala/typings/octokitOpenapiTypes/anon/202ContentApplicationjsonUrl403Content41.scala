package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202ContentApplicationjsonUrl403Content41` extends StObject {
  
  /** @description Response */
  var `202`: ContentApplicationjsonUrl
  
  var `403`: Content41
  
  var `422`: Content414
}
object `202ContentApplicationjsonUrl403Content41` {
  
  inline def apply(`202`: ContentApplicationjsonUrl, `403`: Content41, `422`: Content414): `202ContentApplicationjsonUrl403Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202ContentApplicationjsonUrl403Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202ContentApplicationjsonUrl403Content41`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonUrl): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
