package typings.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.meteorNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmbiguousErrorMessages extends js.Object {
  
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
  implicit class AmbiguousErrorMessagesOps[Self <: AmbiguousErrorMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmbiguousErrorMessages(value: Boolean): Self = this.set("ambiguousErrorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmbiguousErrorMessages: Self = this.set("ambiguousErrorMessages", js.undefined)
    
    @scala.inline
    def setDefaultFieldSelector(value: StringDictionary[typings.meteor.meteorNumbers.`0` | `1`]): Self = this.set("defaultFieldSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFieldSelector: Self = this.set("defaultFieldSelector", js.undefined)
    
    @scala.inline
    def setForbidClientAccountCreation(value: Boolean): Self = this.set("forbidClientAccountCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForbidClientAccountCreation: Self = this.set("forbidClientAccountCreation", js.undefined)
    
    @scala.inline
    def setLoginExpirationInDays(value: Double): Self = this.set("loginExpirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginExpirationInDays: Self = this.set("loginExpirationInDays", js.undefined)
    
    @scala.inline
    def setOauthSecretKey(value: String): Self = this.set("oauthSecretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauthSecretKey: Self = this.set("oauthSecretKey", js.undefined)
    
    @scala.inline
    def setPasswordEnrollTokenExpirationInDays(value: Double): Self = this.set("passwordEnrollTokenExpirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordEnrollTokenExpirationInDays: Self = this.set("passwordEnrollTokenExpirationInDays", js.undefined)
    
    @scala.inline
    def setPasswordResetTokenExpirationInDays(value: Double): Self = this.set("passwordResetTokenExpirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordResetTokenExpirationInDays: Self = this.set("passwordResetTokenExpirationInDays", js.undefined)
    
    @scala.inline
    def setRestrictCreationByEmailDomain(value: String | js.Function): Self = this.set("restrictCreationByEmailDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictCreationByEmailDomain: Self = this.set("restrictCreationByEmailDomain", js.undefined)
    
    @scala.inline
    def setSendVerificationEmail(value: Boolean): Self = this.set("sendVerificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendVerificationEmail: Self = this.set("sendVerificationEmail", js.undefined)
  }
}
