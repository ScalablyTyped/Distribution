package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPasswordValidationPolicy extends StObject {
  
  /** Number of failed login attempts allowed before user get locked. */
  var allowedFailedAttempts: js.UndefOr[Double] = js.undefined
  
  /** If true, failed login attempts check will be enabled. */
  var enableFailedAttemptsCheck: js.UndefOr[Boolean] = js.undefined
  
  /** If true, the user must specify the current password before changing the password. This flag is supported only for MySQL. */
  var enablePasswordVerification: js.UndefOr[Boolean] = js.undefined
  
  /** Expiration duration after password is updated. */
  var passwordExpirationDuration: js.UndefOr[String] = js.undefined
  
  /** Output only. Read-only password status. */
  var status: js.UndefOr[PasswordStatus] = js.undefined
}
object UserPasswordValidationPolicy {
  
  inline def apply(): UserPasswordValidationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPasswordValidationPolicy]
  }
  
  extension [Self <: UserPasswordValidationPolicy](x: Self) {
    
    inline def setAllowedFailedAttempts(value: Double): Self = StObject.set(x, "allowedFailedAttempts", value.asInstanceOf[js.Any])
    
    inline def setAllowedFailedAttemptsUndefined: Self = StObject.set(x, "allowedFailedAttempts", js.undefined)
    
    inline def setEnableFailedAttemptsCheck(value: Boolean): Self = StObject.set(x, "enableFailedAttemptsCheck", value.asInstanceOf[js.Any])
    
    inline def setEnableFailedAttemptsCheckUndefined: Self = StObject.set(x, "enableFailedAttemptsCheck", js.undefined)
    
    inline def setEnablePasswordVerification(value: Boolean): Self = StObject.set(x, "enablePasswordVerification", value.asInstanceOf[js.Any])
    
    inline def setEnablePasswordVerificationUndefined: Self = StObject.set(x, "enablePasswordVerification", js.undefined)
    
    inline def setPasswordExpirationDuration(value: String): Self = StObject.set(x, "passwordExpirationDuration", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationDurationUndefined: Self = StObject.set(x, "passwordExpirationDuration", js.undefined)
    
    inline def setStatus(value: PasswordStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
