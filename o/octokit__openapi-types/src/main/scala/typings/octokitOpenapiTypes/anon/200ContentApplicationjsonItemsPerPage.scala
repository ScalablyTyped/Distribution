package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonItemsPerPage` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonItemsPerPage
}
object `200ContentApplicationjsonItemsPerPage` {
  
  inline def apply(`200`: ContentApplicationjsonItemsPerPage): `200ContentApplicationjsonItemsPerPage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonItemsPerPage`]
  }
  
  extension [Self <: `200ContentApplicationjsonItemsPerPage`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonItemsPerPage): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
