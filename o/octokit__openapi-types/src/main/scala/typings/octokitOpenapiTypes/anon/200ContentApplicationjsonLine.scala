package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonLine` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonLine
  
  var `404`: Content6
}
object `200ContentApplicationjsonLine` {
  
  inline def apply(`200`: ContentApplicationjsonLine, `404`: Content6): `200ContentApplicationjsonLine` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonLine`]
  }
  
  extension [Self <: `200ContentApplicationjsonLine`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonLine): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
