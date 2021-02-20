package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsCreateRegistrationTokenForRepoResponseData extends StObject {
  
  var expires_at: String = js.native
  
  var token: String = js.native
}
object ActionsCreateRegistrationTokenForRepoResponseData {
  
  @scala.inline
  def apply(expires_at: String, token: String): ActionsCreateRegistrationTokenForRepoResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRegistrationTokenForRepoResponseData]
  }
  
  @scala.inline
  implicit class ActionsCreateRegistrationTokenForRepoResponseDataMutableBuilder[Self <: ActionsCreateRegistrationTokenForRepoResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
