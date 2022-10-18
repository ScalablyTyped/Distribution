package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `318` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRepositoriesArrayTotalcountNumber
}
object `318` {
  
  inline def apply(`200`: ContentApplicationjsonRepositoriesArrayTotalcountNumber): `318` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`318`]
  }
  
  extension [Self <: `318`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRepositoriesArrayTotalcountNumber): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
