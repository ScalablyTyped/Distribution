package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginPageTextVisibilitySettings extends StObject {
  
  var hideAccountResetCredentials: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var hideCannotAccessYourAccount: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var hideForgotMyPassword: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var hidePrivacyAndCookies: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var hideResetItNow: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var hideTermsOfUse: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object LoginPageTextVisibilitySettings {
  
  inline def apply(): LoginPageTextVisibilitySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginPageTextVisibilitySettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginPageTextVisibilitySettings] (val x: Self) extends AnyVal {
    
    inline def setHideAccountResetCredentials(value: NullableOption[Boolean]): Self = StObject.set(x, "hideAccountResetCredentials", value.asInstanceOf[js.Any])
    
    inline def setHideAccountResetCredentialsNull: Self = StObject.set(x, "hideAccountResetCredentials", null)
    
    inline def setHideAccountResetCredentialsUndefined: Self = StObject.set(x, "hideAccountResetCredentials", js.undefined)
    
    inline def setHideCannotAccessYourAccount(value: NullableOption[Boolean]): Self = StObject.set(x, "hideCannotAccessYourAccount", value.asInstanceOf[js.Any])
    
    inline def setHideCannotAccessYourAccountNull: Self = StObject.set(x, "hideCannotAccessYourAccount", null)
    
    inline def setHideCannotAccessYourAccountUndefined: Self = StObject.set(x, "hideCannotAccessYourAccount", js.undefined)
    
    inline def setHideForgotMyPassword(value: NullableOption[Boolean]): Self = StObject.set(x, "hideForgotMyPassword", value.asInstanceOf[js.Any])
    
    inline def setHideForgotMyPasswordNull: Self = StObject.set(x, "hideForgotMyPassword", null)
    
    inline def setHideForgotMyPasswordUndefined: Self = StObject.set(x, "hideForgotMyPassword", js.undefined)
    
    inline def setHidePrivacyAndCookies(value: NullableOption[Boolean]): Self = StObject.set(x, "hidePrivacyAndCookies", value.asInstanceOf[js.Any])
    
    inline def setHidePrivacyAndCookiesNull: Self = StObject.set(x, "hidePrivacyAndCookies", null)
    
    inline def setHidePrivacyAndCookiesUndefined: Self = StObject.set(x, "hidePrivacyAndCookies", js.undefined)
    
    inline def setHideResetItNow(value: NullableOption[Boolean]): Self = StObject.set(x, "hideResetItNow", value.asInstanceOf[js.Any])
    
    inline def setHideResetItNowNull: Self = StObject.set(x, "hideResetItNow", null)
    
    inline def setHideResetItNowUndefined: Self = StObject.set(x, "hideResetItNow", js.undefined)
    
    inline def setHideTermsOfUse(value: NullableOption[Boolean]): Self = StObject.set(x, "hideTermsOfUse", value.asInstanceOf[js.Any])
    
    inline def setHideTermsOfUseNull: Self = StObject.set(x, "hideTermsOfUse", null)
    
    inline def setHideTermsOfUseUndefined: Self = StObject.set(x, "hideTermsOfUse", js.undefined)
  }
}
