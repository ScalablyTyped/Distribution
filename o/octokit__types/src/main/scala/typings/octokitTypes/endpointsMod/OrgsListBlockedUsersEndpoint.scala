package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsListBlockedUsersEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
}
object OrgsListBlockedUsersEndpoint {
  
  @scala.inline
  def apply(org_ : String): OrgsListBlockedUsersEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListBlockedUsersEndpoint]
  }
  
  @scala.inline
  implicit class OrgsListBlockedUsersEndpointMutableBuilder[Self <: OrgsListBlockedUsersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
