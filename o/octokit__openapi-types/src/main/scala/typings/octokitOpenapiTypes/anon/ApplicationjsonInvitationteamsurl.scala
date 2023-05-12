package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInvitationteamsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Invitationteamsurl
}
object ApplicationjsonInvitationteamsurl {
  
  inline def apply(applicationSlashjson: Invitationteamsurl): ApplicationjsonInvitationteamsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInvitationteamsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonInvitationteamsurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Invitationteamsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
