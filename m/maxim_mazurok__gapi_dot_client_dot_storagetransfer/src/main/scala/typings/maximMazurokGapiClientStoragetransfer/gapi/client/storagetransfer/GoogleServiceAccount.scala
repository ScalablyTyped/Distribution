package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleServiceAccount extends StObject {
  
  /** Email address of the service account. */
  var accountEmail: js.UndefOr[String] = js.native
}
object GoogleServiceAccount {
  
  @scala.inline
  def apply(): GoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleServiceAccount]
  }
  
  @scala.inline
  implicit class GoogleServiceAccountMutableBuilder[Self <: GoogleServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
  }
}
