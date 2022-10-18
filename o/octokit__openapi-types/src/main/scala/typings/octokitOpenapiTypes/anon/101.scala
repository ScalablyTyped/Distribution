package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCheckrunsurl
}
object `101` {
  
  inline def apply(`200`: ContentApplicationjsonCheckrunsurl): `101` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`101`]
  }
  
  extension [Self <: `101`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCheckrunsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
