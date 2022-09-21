package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonMeta` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonMeta
}
object `201ContentApplicationjsonMeta` {
  
  inline def apply(`201`: ContentApplicationjsonMeta): `201ContentApplicationjsonMeta` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonMeta`]
  }
  
  extension [Self <: `201ContentApplicationjsonMeta`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonMeta): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
