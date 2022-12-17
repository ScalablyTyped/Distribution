package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `445` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonContactemail
}
object `445` {
  
  inline def apply(`200`: ContentApplicationjsonContactemail): `445` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`445`]
  }
  
  extension [Self <: `445`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonContactemail): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
