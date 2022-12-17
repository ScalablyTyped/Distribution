package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonDismissstalereviews422Content397` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDismissstalereviews
  
  var `422`: Content397
}
object `200ContentApplicationjsonDismissstalereviews422Content397` {
  
  inline def apply(`200`: ContentApplicationjsonDismissstalereviews, `422`: Content397): `200ContentApplicationjsonDismissstalereviews422Content397` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonDismissstalereviews422Content397`]
  }
  
  extension [Self <: `200ContentApplicationjsonDismissstalereviews422Content397`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonDismissstalereviews): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
