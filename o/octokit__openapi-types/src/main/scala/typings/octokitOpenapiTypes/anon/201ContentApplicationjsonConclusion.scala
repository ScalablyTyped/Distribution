package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonConclusion` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonConclusion
}
object `201ContentApplicationjsonConclusion` {
  
  inline def apply(`201`: ContentApplicationjsonConclusion): `201ContentApplicationjsonConclusion` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonConclusion`]
  }
  
  extension [Self <: `201ContentApplicationjsonConclusion`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonConclusion): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
