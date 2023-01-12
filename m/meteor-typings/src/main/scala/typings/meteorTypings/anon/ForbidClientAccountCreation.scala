package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForbidClientAccountCreation extends StObject {
  
  var forbidClientAccountCreation: js.UndefOr[Boolean] = js.undefined
  
  var loginExpirationInDays: js.UndefOr[Double] = js.undefined
  
  var oauthSecretKey: js.UndefOr[String] = js.undefined
  
  var restrictCreationByEmailDomain: js.UndefOr[String | js.Function] = js.undefined
  
  var sendVerificationEmail: js.UndefOr[Boolean] = js.undefined
}
object ForbidClientAccountCreation {
  
  inline def apply(): ForbidClientAccountCreation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForbidClientAccountCreation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForbidClientAccountCreation] (val x: Self) extends AnyVal {
    
    inline def setForbidClientAccountCreation(value: Boolean): Self = StObject.set(x, "forbidClientAccountCreation", value.asInstanceOf[js.Any])
    
    inline def setForbidClientAccountCreationUndefined: Self = StObject.set(x, "forbidClientAccountCreation", js.undefined)
    
    inline def setLoginExpirationInDays(value: Double): Self = StObject.set(x, "loginExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setLoginExpirationInDaysUndefined: Self = StObject.set(x, "loginExpirationInDays", js.undefined)
    
    inline def setOauthSecretKey(value: String): Self = StObject.set(x, "oauthSecretKey", value.asInstanceOf[js.Any])
    
    inline def setOauthSecretKeyUndefined: Self = StObject.set(x, "oauthSecretKey", js.undefined)
    
    inline def setRestrictCreationByEmailDomain(value: String | js.Function): Self = StObject.set(x, "restrictCreationByEmailDomain", value.asInstanceOf[js.Any])
    
    inline def setRestrictCreationByEmailDomainUndefined: Self = StObject.set(x, "restrictCreationByEmailDomain", js.undefined)
    
    inline def setSendVerificationEmail(value: Boolean): Self = StObject.set(x, "sendVerificationEmail", value.asInstanceOf[js.Any])
    
    inline def setSendVerificationEmailUndefined: Self = StObject.set(x, "sendVerificationEmail", js.undefined)
  }
}
