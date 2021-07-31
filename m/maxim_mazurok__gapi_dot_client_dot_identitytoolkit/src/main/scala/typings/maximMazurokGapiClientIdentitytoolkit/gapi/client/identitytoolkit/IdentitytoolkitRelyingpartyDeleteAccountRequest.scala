package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyDeleteAccountRequest extends StObject {
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  
  /** The GITKit token or STS id token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartyDeleteAccountRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyDeleteAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyDeleteAccountRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyDeleteAccountRequestMutableBuilder[Self <: IdentitytoolkitRelyingpartyDeleteAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
