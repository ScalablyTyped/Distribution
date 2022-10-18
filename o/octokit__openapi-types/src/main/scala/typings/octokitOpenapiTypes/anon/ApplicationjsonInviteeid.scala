package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInviteeid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Inviteeid
}
object ApplicationjsonInviteeid {
  
  inline def apply(applicationSlashjson: Inviteeid): ApplicationjsonInviteeid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInviteeid]
  }
  
  extension [Self <: ApplicationjsonInviteeid](x: Self) {
    
    inline def setApplicationSlashjson(value: Inviteeid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
