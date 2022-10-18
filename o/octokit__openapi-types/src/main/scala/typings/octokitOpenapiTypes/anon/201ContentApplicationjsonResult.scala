package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonResult` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonResult
}
object `201ContentApplicationjsonResult` {
  
  inline def apply(`201`: ContentApplicationjsonResult): `201ContentApplicationjsonResult` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonResult`]
  }
  
  extension [Self <: `201ContentApplicationjsonResult`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonResult): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
