package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `438` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRepositoriesArrayTotalcountNumber
}
object `438` {
  
  inline def apply(`200`: ContentApplicationjsonRepositoriesArrayTotalcountNumber): `438` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`438`]
  }
  
  extension [Self <: `438`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRepositoriesArrayTotalcountNumber): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
