package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateRegistrationTokenForOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
}
object ActionsCreateRegistrationTokenForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String): ActionsCreateRegistrationTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRegistrationTokenForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsCreateRegistrationTokenForOrgEndpointMutableBuilder[Self <: ActionsCreateRegistrationTokenForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
