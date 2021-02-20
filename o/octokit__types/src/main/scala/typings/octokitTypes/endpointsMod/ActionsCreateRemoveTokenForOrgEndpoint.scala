package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsCreateRemoveTokenForOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
}
object ActionsCreateRemoveTokenForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String): ActionsCreateRemoveTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRemoveTokenForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsCreateRemoveTokenForOrgEndpointMutableBuilder[Self <: ActionsCreateRemoveTokenForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
