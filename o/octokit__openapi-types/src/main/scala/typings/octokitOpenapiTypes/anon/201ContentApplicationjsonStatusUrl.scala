package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonStatusUrl` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonStatusUrl
}
object `201ContentApplicationjsonStatusUrl` {
  
  inline def apply(`201`: ContentApplicationjsonStatusUrl): `201ContentApplicationjsonStatusUrl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonStatusUrl`]
  }
  
  extension [Self <: `201ContentApplicationjsonStatusUrl`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonStatusUrl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
