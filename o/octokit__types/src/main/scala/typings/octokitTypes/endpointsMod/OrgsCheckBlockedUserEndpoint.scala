package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsCheckBlockedUserEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  var username: String = js.native
}
object OrgsCheckBlockedUserEndpoint {
  
  @scala.inline
  def apply(org_ : String, username: String): OrgsCheckBlockedUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCheckBlockedUserEndpoint]
  }
  
  @scala.inline
  implicit class OrgsCheckBlockedUserEndpointMutableBuilder[Self <: OrgsCheckBlockedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
