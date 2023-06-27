package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonLogurl` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonLogurl
  
  var `422`: Content414
}
object `201ContentApplicationjsonLogurl` {
  
  inline def apply(`201`: ContentApplicationjsonLogurl, `422`: Content414): `201ContentApplicationjsonLogurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonLogurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonLogurl`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonLogurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
