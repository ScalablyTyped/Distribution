package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201403404410` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonBodytextHeadersLocation
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `410`: Content41
  
  var `422`: Content414
}
object `201403404410` {
  
  inline def apply(
    `201`: ContentApplicationjsonBodytextHeadersLocation,
    `403`: Content41,
    `404`: Content41,
    `410`: Content41,
    `422`: Content414
  ): `201403404410` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201403404410`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201403404410`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonBodytextHeadersLocation): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content41): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
