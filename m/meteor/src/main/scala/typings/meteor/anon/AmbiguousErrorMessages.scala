package typings.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmbiguousErrorMessages extends StObject {
  
  var ambiguousErrorMessages: js.UndefOr[Boolean] = js.undefined
  
  var defaultFieldSelector: js.UndefOr[StringDictionary[typings.meteor.meteorInts.`0` | typings.meteor.meteorInts.`1`]] = js.undefined
  
  var forbidClientAccountCreation: js.UndefOr[Boolean] = js.undefined
  
  var loginExpirationInDays: js.UndefOr[Double] = js.undefined
  
  var oauthSecretKey: js.UndefOr[String] = js.undefined
  
  var passwordEnrollTokenExpirationInDays: js.UndefOr[Double] = js.undefined
  
  var passwordResetTokenExpirationInDays: js.UndefOr[Double] = js.undefined
  
  var restrictCreationByEmailDomain: js.UndefOr[String | js.Function] = js.undefined
  
  var sendVerificationEmail: js.UndefOr[Boolean] = js.undefined
}
object AmbiguousErrorMessages {
  
  inline def apply(): AmbiguousErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmbiguousErrorMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmbiguousErrorMessages] (val x: Self) extends AnyVal {
    
    inline def setAmbiguousErrorMessages(value: Boolean): Self = StObject.set(x, "ambiguousErrorMessages", value.asInstanceOf[js.Any])
    
    inline def setAmbiguousErrorMessagesUndefined: Self = StObject.set(x, "ambiguousErrorMessages", js.undefined)
    
    inline def setDefaultFieldSelector(value: StringDictionary[typings.meteor.meteorInts.`0` | typings.meteor.meteorInts.`1`]): Self = StObject.set(x, "defaultFieldSelector", value.asInstanceOf[js.Any])
    
    inline def setDefaultFieldSelectorUndefined: Self = StObject.set(x, "defaultFieldSelector", js.undefined)
    
    inline def setForbidClientAccountCreation(value: Boolean): Self = StObject.set(x, "forbidClientAccountCreation", value.asInstanceOf[js.Any])
    
    inline def setForbidClientAccountCreationUndefined: Self = StObject.set(x, "forbidClientAccountCreation", js.undefined)
    
    inline def setLoginExpirationInDays(value: Double): Self = StObject.set(x, "loginExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setLoginExpirationInDaysUndefined: Self = StObject.set(x, "loginExpirationInDays", js.undefined)
    
    inline def setOauthSecretKey(value: String): Self = StObject.set(x, "oauthSecretKey", value.asInstanceOf[js.Any])
    
    inline def setOauthSecretKeyUndefined: Self = StObject.set(x, "oauthSecretKey", js.undefined)
    
    inline def setPasswordEnrollTokenExpirationInDays(value: Double): Self = StObject.set(x, "passwordEnrollTokenExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordEnrollTokenExpirationInDaysUndefined: Self = StObject.set(x, "passwordEnrollTokenExpirationInDays", js.undefined)
    
    inline def setPasswordResetTokenExpirationInDays(value: Double): Self = StObject.set(x, "passwordResetTokenExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordResetTokenExpirationInDaysUndefined: Self = StObject.set(x, "passwordResetTokenExpirationInDays", js.undefined)
    
    inline def setRestrictCreationByEmailDomain(value: String | js.Function): Self = StObject.set(x, "restrictCreationByEmailDomain", value.asInstanceOf[js.Any])
    
    inline def setRestrictCreationByEmailDomainUndefined: Self = StObject.set(x, "restrictCreationByEmailDomain", js.undefined)
    
    inline def setSendVerificationEmail(value: Boolean): Self = StObject.set(x, "sendVerificationEmail", value.asInstanceOf[js.Any])
    
    inline def setSendVerificationEmailUndefined: Self = StObject.set(x, "sendVerificationEmail", js.undefined)
  }
}
