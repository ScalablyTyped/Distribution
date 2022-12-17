package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonCreatedat` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonCreatedat
}
object `201ContentApplicationjsonCreatedat` {
  
  inline def apply(`201`: ContentApplicationjsonCreatedat): `201ContentApplicationjsonCreatedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonCreatedat`]
  }
  
  extension [Self <: `201ContentApplicationjsonCreatedat`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonCreatedat): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
