package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonTruncated` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonTruncated
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `422`: Content421
}
object `201ContentApplicationjsonTruncated` {
  
  inline def apply(`201`: ContentApplicationjsonTruncated, `403`: Content55, `404`: Content55, `422`: Content421): `201ContentApplicationjsonTruncated` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonTruncated`]
  }
  
  extension [Self <: `201ContentApplicationjsonTruncated`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonTruncated): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
