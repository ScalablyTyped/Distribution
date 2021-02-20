package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAccount extends StObject {
  
  /** Required. Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs. */
  var password: js.UndefOr[String] = js.native
  
  /** Required. The user name of the Google account. */
  var username: js.UndefOr[String] = js.native
}
object GoogleAccount {
  
  @scala.inline
  def apply(): GoogleAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAccount]
  }
  
  @scala.inline
  implicit class GoogleAccountMutableBuilder[Self <: GoogleAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
