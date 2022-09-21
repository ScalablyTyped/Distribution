package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `566` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonInreplytoid
}
object `566` {
  
  inline def apply(`200`: ContentApplicationjsonInreplytoid): `566` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`566`]
  }
  
  extension [Self <: `566`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonInreplytoid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
