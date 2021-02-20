package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartySignOutUserResponse extends StObject {
  
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.native
}
object IdentitytoolkitRelyingpartySignOutUserResponse {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignOutUserResponse]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartySignOutUserResponseMutableBuilder[Self <: IdentitytoolkitRelyingpartySignOutUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
