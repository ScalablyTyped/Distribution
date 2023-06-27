package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonRecord404Content41` extends StObject {
  
  /** @description Response after successfully creating a secret */
  var `201`: ContentApplicationjsonRecord
  
  var `404`: Content41
  
  var `422`: Content414
}
object `201ContentApplicationjsonRecord404Content41` {
  
  inline def apply(`201`: ContentApplicationjsonRecord, `404`: Content41, `422`: Content414): `201ContentApplicationjsonRecord404Content41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonRecord404Content41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonRecord404Content41`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonRecord): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
