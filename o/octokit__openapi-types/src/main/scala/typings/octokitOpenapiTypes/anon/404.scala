package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAppslug
  
  var `404`: Content6
}
object `404` {
  
  inline def apply(`200`: ContentApplicationjsonAppslug, `404`: Content6): `404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404`]
  }
  
  extension [Self <: `404`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAppslug): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
