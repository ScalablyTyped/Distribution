package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharingInvitation extends StObject {
  
  // The email address provided for the recipient of the sharing invitation. Read-only.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Provides information about who sent the invitation that created this permission, if that information is available.
    * Read-only.
    */
  var invitedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  var redeemedBy: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
  var signInRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object SharingInvitation {
  
  inline def apply(): SharingInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingInvitation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharingInvitation] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setInvitedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "invitedBy", value.asInstanceOf[js.Any])
    
    inline def setInvitedByNull: Self = StObject.set(x, "invitedBy", null)
    
    inline def setInvitedByUndefined: Self = StObject.set(x, "invitedBy", js.undefined)
    
    inline def setRedeemedBy(value: NullableOption[String]): Self = StObject.set(x, "redeemedBy", value.asInstanceOf[js.Any])
    
    inline def setRedeemedByNull: Self = StObject.set(x, "redeemedBy", null)
    
    inline def setRedeemedByUndefined: Self = StObject.set(x, "redeemedBy", js.undefined)
    
    inline def setSignInRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "signInRequired", value.asInstanceOf[js.Any])
    
    inline def setSignInRequiredNull: Self = StObject.set(x, "signInRequired", null)
    
    inline def setSignInRequiredUndefined: Self = StObject.set(x, "signInRequired", js.undefined)
  }
}
