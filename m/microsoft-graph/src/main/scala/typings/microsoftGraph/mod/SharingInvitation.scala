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
  
  @scala.inline
  def apply(): SharingInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingInvitation]
  }
  
  @scala.inline
  implicit class SharingInvitationMutableBuilder[Self <: SharingInvitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setInvitedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "invitedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedByNull: Self = StObject.set(x, "invitedBy", null)
    
    @scala.inline
    def setInvitedByUndefined: Self = StObject.set(x, "invitedBy", js.undefined)
    
    @scala.inline
    def setRedeemedBy(value: NullableOption[String]): Self = StObject.set(x, "redeemedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeemedByNull: Self = StObject.set(x, "redeemedBy", null)
    
    @scala.inline
    def setRedeemedByUndefined: Self = StObject.set(x, "redeemedBy", js.undefined)
    
    @scala.inline
    def setSignInRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "signInRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInRequiredNull: Self = StObject.set(x, "signInRequired", null)
    
    @scala.inline
    def setSignInRequiredUndefined: Self = StObject.set(x, "signInRequired", js.undefined)
  }
}
