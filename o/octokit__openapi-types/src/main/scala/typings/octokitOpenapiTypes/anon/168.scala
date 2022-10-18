package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonInreplytoid
}
object `168` {
  
  inline def apply(`200`: ContentApplicationjsonInreplytoid): `168` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`168`]
  }
  
  extension [Self <: `168`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonInreplytoid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
