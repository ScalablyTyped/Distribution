package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyGetAccountInfoRequest extends StObject {
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  
  /** The list of emails of the users to inquiry. */
  var email: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  
  /** The list of local ID's of the users to inquiry. */
  var localId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Privileged caller can query users by specified phone number. */
  var phoneNumber: js.UndefOr[js.Array[String]] = js.undefined
}
object IdentitytoolkitRelyingpartyGetAccountInfoRequest {
  
  inline def apply(): IdentitytoolkitRelyingpartyGetAccountInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyGetAccountInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentitytoolkitRelyingpartyGetAccountInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    inline def setEmail(value: js.Array[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVarargs(value: String*): Self = StObject.set(x, "email", js.Array(value*))
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setLocalId(value: js.Array[String]): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setLocalIdVarargs(value: String*): Self = StObject.set(x, "localId", js.Array(value*))
    
    inline def setPhoneNumber(value: js.Array[String]): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhoneNumberVarargs(value: String*): Self = StObject.set(x, "phoneNumber", js.Array(value*))
  }
}
