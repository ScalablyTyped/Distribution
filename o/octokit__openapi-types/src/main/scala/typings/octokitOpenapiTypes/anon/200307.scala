package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200307` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAllowupdatebranch
  
  var `307`: Content6
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `422`: Content8
}
object `200307` {
  
  inline def apply(
    `200`: ContentApplicationjsonAllowupdatebranch,
    `307`: Content6,
    `403`: Content6,
    `404`: Content6,
    `422`: Content8
  ): `200307` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("307")(`307`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200307`]
  }
  
  extension [Self <: `200307`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAllowupdatebranch): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set307(value: Content6): Self = StObject.set(x, "307", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
