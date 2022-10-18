package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200404500` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBasecommit
  
  var `404`: Content6
  
  var `500`: Content6
}
object `200404500` {
  
  inline def apply(`200`: ContentApplicationjsonBasecommit, `404`: Content6, `500`: Content6): `200404500` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200404500`]
  }
  
  extension [Self <: `200404500`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBasecommit): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content6): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
