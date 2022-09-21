package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonInvitee` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonInvitee
}
object `200ContentApplicationjsonInvitee` {
  
  inline def apply(`200`: ContentApplicationjsonInvitee): `200ContentApplicationjsonInvitee` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonInvitee`]
  }
  
  extension [Self <: `200ContentApplicationjsonInvitee`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonInvitee): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
