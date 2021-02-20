package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartySignOutUserRequest extends StObject {
  
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.native
}
object IdentitytoolkitRelyingpartySignOutUserRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartySignOutUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignOutUserRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartySignOutUserRequestMutableBuilder[Self <: IdentitytoolkitRelyingpartySignOutUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
