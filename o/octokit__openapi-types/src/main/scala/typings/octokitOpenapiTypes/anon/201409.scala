package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201409` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonCname
  
  var `409`: Content6
  
  var `422`: Content8
}
object `201409` {
  
  inline def apply(`201`: ContentApplicationjsonCname, `409`: Content6, `422`: Content8): `201409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201409`]
  }
  
  extension [Self <: `201409`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonCname): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content6): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
