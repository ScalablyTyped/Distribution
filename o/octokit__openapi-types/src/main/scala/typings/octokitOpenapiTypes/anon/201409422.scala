package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201409422` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonCustom404
  
  var `409`: Content55
  
  var `422`: Content421
}
object `201409422` {
  
  inline def apply(`201`: ContentApplicationjsonCustom404, `409`: Content55, `422`: Content421): `201409422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201409422`]
  }
  
  extension [Self <: `201409422`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonCustom404): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content55): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
