package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsCreateRemoveTokenForOrgResponseData extends StObject {
  
  var expires_at: String = js.native
  
  var token: String = js.native
}
object ActionsCreateRemoveTokenForOrgResponseData {
  
  @scala.inline
  def apply(expires_at: String, token: String): ActionsCreateRemoveTokenForOrgResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRemoveTokenForOrgResponseData]
  }
  
  @scala.inline
  implicit class ActionsCreateRemoveTokenForOrgResponseDataMutableBuilder[Self <: ActionsCreateRemoveTokenForOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
