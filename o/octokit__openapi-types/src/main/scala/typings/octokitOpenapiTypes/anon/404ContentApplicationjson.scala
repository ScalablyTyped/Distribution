package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404ContentApplicationjson` extends StObject {
  
  /** Otherwise a `404` status code is returned. */
  var `404`: ContentApplicationjson
}
object `404ContentApplicationjson` {
  
  inline def apply(`404`: ContentApplicationjson): `404ContentApplicationjson` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404ContentApplicationjson`]
  }
  
  extension [Self <: `404ContentApplicationjson`](x: Self) {
    
    inline def set404(value: ContentApplicationjson): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
