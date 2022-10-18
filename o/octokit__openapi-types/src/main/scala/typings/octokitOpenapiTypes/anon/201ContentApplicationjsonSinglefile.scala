package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonSinglefile` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonSinglefile
}
object `201ContentApplicationjsonSinglefile` {
  
  inline def apply(`201`: ContentApplicationjsonSinglefile): `201ContentApplicationjsonSinglefile` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonSinglefile`]
  }
  
  extension [Self <: `201ContentApplicationjsonSinglefile`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonSinglefile): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
