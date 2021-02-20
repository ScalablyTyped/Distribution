package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveMatterPermissionsRequest extends StObject {
  
  /** The account ID. */
  var accountId: js.UndefOr[String] = js.native
}
object RemoveMatterPermissionsRequest {
  
  @scala.inline
  def apply(): RemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveMatterPermissionsRequest]
  }
  
  @scala.inline
  implicit class RemoveMatterPermissionsRequestMutableBuilder[Self <: RemoveMatterPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
