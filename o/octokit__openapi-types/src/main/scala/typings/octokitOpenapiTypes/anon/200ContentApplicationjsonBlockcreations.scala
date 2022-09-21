package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBlockcreations` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBlockcreations
  
  var `404`: Content55
}
object `200ContentApplicationjsonBlockcreations` {
  
  inline def apply(`200`: ContentApplicationjsonBlockcreations, `404`: Content55): `200ContentApplicationjsonBlockcreations` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBlockcreations`]
  }
  
  extension [Self <: `200ContentApplicationjsonBlockcreations`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBlockcreations): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
