package typings.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.meteorNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmbiguousErrorMessages extends StObject {
  
  var ambiguousErrorMessages: js.UndefOr[Boolean] = js.native
  
  var defaultFieldSelector: js.UndefOr[StringDictionary[typings.meteor.meteorNumbers.`0` | `1`]] = js.native
  
  var forbidClientAccountCreation: js.UndefOr[Boolean] = js.native
  
  var loginExpirationInDays: js.UndefOr[Double] = js.native
  
  var oauthSecretKey: js.UndefOr[String] = js.native
  
  var passwordEnrollTokenExpirationInDays: js.UndefOr[Double] = js.native
  
  var passwordResetTokenExpirationInDays: js.UndefOr[Double] = js.native
  
  var restrictCreationByEmailDomain: js.UndefOr[String | js.Function] = js.native
  
  var sendVerificationEmail: js.UndefOr[Boolean] = js.native
}
object AmbiguousErrorMessages {
  
  @scala.inline
  def apply(): AmbiguousErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmbiguousErrorMessages]
  }
  
  @scala.inline
  implicit class AmbiguousErrorMessagesMutableBuilder[Self <: AmbiguousErrorMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmbiguousErrorMessages(value: Boolean): Self = StObject.set(x, "ambiguousErrorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmbiguousErrorMessagesUndefined: Self = StObject.set(x, "ambiguousErrorMessages", js.undefined)
    
    @scala.inline
    def setDefaultFieldSelector(value: StringDictionary[typings.meteor.meteorNumbers.`0` | `1`]): Self = StObject.set(x, "defaultFieldSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFieldSelectorUndefined: Self = StObject.set(x, "defaultFieldSelector", js.undefined)
    
    @scala.inline
    def setForbidClientAccountCreation(value: Boolean): Self = StObject.set(x, "forbidClientAccountCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbidClientAccountCreationUndefined: Self = StObject.set(x, "forbidClientAccountCreation", js.undefined)
    
    @scala.inline
    def setLoginExpirationInDays(value: Double): Self = StObject.set(x, "loginExpirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginExpirationInDaysUndefined: Self = StObject.set(x, "loginExpirationInDays", js.undefined)
    
    @scala.inline
    def setOauthSecretKey(value: String): Self = StObject.set(x, "oauthSecretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthSecretKeyUndefined: Self = StObject.set(x, "oauthSecretKey", js.undefined)
    
    @scala.inline
    def setPasswordEnrollTokenExpirationInDays(value: Double): Self = StObject.set(x, "passwordEnrollTokenExpirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordEnrollTokenExpirationInDaysUndefined: Self = StObject.set(x, "passwordEnrollTokenExpirationInDays", js.undefined)
    
    @scala.inline
    def setPasswordResetTokenExpirationInDays(value: Double): Self = StObject.set(x, "passwordResetTokenExpirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordResetTokenExpirationInDaysUndefined: Self = StObject.set(x, "passwordResetTokenExpirationInDays", js.undefined)
    
    @scala.inline
    def setRestrictCreationByEmailDomain(value: String | js.Function): Self = StObject.set(x, "restrictCreationByEmailDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictCreationByEmailDomainUndefined: Self = StObject.set(x, "restrictCreationByEmailDomain", js.undefined)
    
    @scala.inline
    def setSendVerificationEmail(value: Boolean): Self = StObject.set(x, "sendVerificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendVerificationEmailUndefined: Self = StObject.set(x, "sendVerificationEmail", js.undefined)
  }
}
