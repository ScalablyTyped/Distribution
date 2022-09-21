package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonExcludeownerprojects` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonExcludeownerprojects
  
  var `404`: Content55
  
  var `422`: Content421
}
object `201ContentApplicationjsonExcludeownerprojects` {
  
  inline def apply(`201`: ContentApplicationjsonExcludeownerprojects, `404`: Content55, `422`: Content421): `201ContentApplicationjsonExcludeownerprojects` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonExcludeownerprojects`]
  }
  
  extension [Self <: `201ContentApplicationjsonExcludeownerprojects`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonExcludeownerprojects): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
