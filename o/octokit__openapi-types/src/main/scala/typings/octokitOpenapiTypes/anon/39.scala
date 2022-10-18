package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRepositoriesTotalcount
}
object `39` {
  
  inline def apply(`200`: ContentApplicationjsonRepositoriesTotalcount): `39` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRepositoriesTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
