package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordValidationPolicy extends StObject {
  
  /** The complexity of the password. */
  var complexity: js.UndefOr[String] = js.undefined
  
  /** Disallow username as a part of the password. */
  var disallowUsernameSubstring: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the password policy is enabled or not. */
  var enablePasswordPolicy: js.UndefOr[Boolean] = js.undefined
  
  /** Minimum number of characters allowed. */
  var minLength: js.UndefOr[Double] = js.undefined
  
  /** Minimum interval after which the password can be changed. This flag is only supported for PostgresSQL. */
  var passwordChangeInterval: js.UndefOr[String] = js.undefined
  
  /** Number of previous passwords that cannot be reused. */
  var reuseInterval: js.UndefOr[Double] = js.undefined
}
object PasswordValidationPolicy {
  
  inline def apply(): PasswordValidationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordValidationPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasswordValidationPolicy] (val x: Self) extends AnyVal {
    
    inline def setComplexity(value: String): Self = StObject.set(x, "complexity", value.asInstanceOf[js.Any])
    
    inline def setComplexityUndefined: Self = StObject.set(x, "complexity", js.undefined)
    
    inline def setDisallowUsernameSubstring(value: Boolean): Self = StObject.set(x, "disallowUsernameSubstring", value.asInstanceOf[js.Any])
    
    inline def setDisallowUsernameSubstringUndefined: Self = StObject.set(x, "disallowUsernameSubstring", js.undefined)
    
    inline def setEnablePasswordPolicy(value: Boolean): Self = StObject.set(x, "enablePasswordPolicy", value.asInstanceOf[js.Any])
    
    inline def setEnablePasswordPolicyUndefined: Self = StObject.set(x, "enablePasswordPolicy", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setPasswordChangeInterval(value: String): Self = StObject.set(x, "passwordChangeInterval", value.asInstanceOf[js.Any])
    
    inline def setPasswordChangeIntervalUndefined: Self = StObject.set(x, "passwordChangeInterval", js.undefined)
    
    inline def setReuseInterval(value: Double): Self = StObject.set(x, "reuseInterval", value.asInstanceOf[js.Any])
    
    inline def setReuseIntervalUndefined: Self = StObject.set(x, "reuseInterval", js.undefined)
  }
}
