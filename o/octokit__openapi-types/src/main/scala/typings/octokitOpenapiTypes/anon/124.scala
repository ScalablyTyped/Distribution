package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonNameNodeid
}
object `124` {
  
  inline def apply(`200`: ContentApplicationjsonNameNodeid): `124` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`124`]
  }
  
  extension [Self <: `124`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonNameNodeid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
