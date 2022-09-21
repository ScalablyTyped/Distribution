package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonInvitee` extends StObject {
  
  /** Response when a new invitation is created */
  var `201`: ContentApplicationjsonInvitee
  
  var `403`: Content55
  
  var `422`: Content421
}
object `201ContentApplicationjsonInvitee` {
  
  inline def apply(`201`: ContentApplicationjsonInvitee, `403`: Content55, `422`: Content421): `201ContentApplicationjsonInvitee` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonInvitee`]
  }
  
  extension [Self <: `201ContentApplicationjsonInvitee`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonInvitee): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
