package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonActive` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonActive
  
  var `404`: Content6
  
  var `422`: Content8
}
object `201ContentApplicationjsonActive` {
  
  inline def apply(`201`: ContentApplicationjsonActive, `404`: Content6, `422`: Content8): `201ContentApplicationjsonActive` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonActive`]
  }
  
  extension [Self <: `201ContentApplicationjsonActive`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonActive): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
