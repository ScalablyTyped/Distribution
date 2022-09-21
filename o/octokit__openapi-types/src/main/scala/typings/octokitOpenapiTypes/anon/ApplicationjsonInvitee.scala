package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInvitee extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Invitee
}
object ApplicationjsonInvitee {
  
  inline def apply(applicationSlashjson: Invitee): ApplicationjsonInvitee = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInvitee]
  }
  
  extension [Self <: ApplicationjsonInvitee](x: Self) {
    
    inline def setApplicationSlashjson(value: Invitee): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
