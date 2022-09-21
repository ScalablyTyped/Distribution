package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authentication
  extends StObject
     with Entity {
  
  // The email address registered to a user for authentication.
  var emailMethods: js.UndefOr[NullableOption[js.Array[EmailAuthenticationMethod]]] = js.undefined
  
  // Represents the FIDO2 security keys registered to a user for authentication.
  var fido2Methods: js.UndefOr[NullableOption[js.Array[Fido2AuthenticationMethod]]] = js.undefined
  
  // Represents all authentication methods registered to a user.
  var methods: js.UndefOr[NullableOption[js.Array[AuthenticationMethod]]] = js.undefined
  
  // The details of the Microsoft Authenticator app registered to a user for authentication.
  var microsoftAuthenticatorMethods: js.UndefOr[NullableOption[js.Array[MicrosoftAuthenticatorAuthenticationMethod]]] = js.undefined
  
  // Represents the status of a long-running operation.
  var operations: js.UndefOr[NullableOption[js.Array[LongRunningOperation]]] = js.undefined
  
  /**
    * Represents the password that's registered to a user for authentication. For security, the password itself will never be
    * returned in the object, but action can be taken to reset a password.
    */
  var passwordMethods: js.UndefOr[NullableOption[js.Array[PasswordAuthenticationMethod]]] = js.undefined
  
  // The phone numbers registered to a user for authentication.
  var phoneMethods: js.UndefOr[NullableOption[js.Array[PhoneAuthenticationMethod]]] = js.undefined
  
  // The software OATH TOTP applications registered to a user for authentication.
  var softwareOathMethods: js.UndefOr[NullableOption[js.Array[SoftwareOathAuthenticationMethod]]] = js.undefined
  
  // Represents a Temporary Access Pass registered to a user for authentication through time-limited passcodes.
  var temporaryAccessPassMethods: js.UndefOr[NullableOption[js.Array[TemporaryAccessPassAuthenticationMethod]]] = js.undefined
  
  // Represents the Windows Hello for Business authentication method registered to a user for authentication.
  var windowsHelloForBusinessMethods: js.UndefOr[NullableOption[js.Array[WindowsHelloForBusinessAuthenticationMethod]]] = js.undefined
}
object Authentication {
  
  inline def apply(): Authentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authentication]
  }
  
  extension [Self <: Authentication](x: Self) {
    
    inline def setEmailMethods(value: NullableOption[js.Array[EmailAuthenticationMethod]]): Self = StObject.set(x, "emailMethods", value.asInstanceOf[js.Any])
    
    inline def setEmailMethodsNull: Self = StObject.set(x, "emailMethods", null)
    
    inline def setEmailMethodsUndefined: Self = StObject.set(x, "emailMethods", js.undefined)
    
    inline def setEmailMethodsVarargs(value: EmailAuthenticationMethod*): Self = StObject.set(x, "emailMethods", js.Array(value*))
    
    inline def setFido2Methods(value: NullableOption[js.Array[Fido2AuthenticationMethod]]): Self = StObject.set(x, "fido2Methods", value.asInstanceOf[js.Any])
    
    inline def setFido2MethodsNull: Self = StObject.set(x, "fido2Methods", null)
    
    inline def setFido2MethodsUndefined: Self = StObject.set(x, "fido2Methods", js.undefined)
    
    inline def setFido2MethodsVarargs(value: Fido2AuthenticationMethod*): Self = StObject.set(x, "fido2Methods", js.Array(value*))
    
    inline def setMethods(value: NullableOption[js.Array[AuthenticationMethod]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsNull: Self = StObject.set(x, "methods", null)
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: AuthenticationMethod*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setMicrosoftAuthenticatorMethods(value: NullableOption[js.Array[MicrosoftAuthenticatorAuthenticationMethod]]): Self = StObject.set(x, "microsoftAuthenticatorMethods", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftAuthenticatorMethodsNull: Self = StObject.set(x, "microsoftAuthenticatorMethods", null)
    
    inline def setMicrosoftAuthenticatorMethodsUndefined: Self = StObject.set(x, "microsoftAuthenticatorMethods", js.undefined)
    
    inline def setMicrosoftAuthenticatorMethodsVarargs(value: MicrosoftAuthenticatorAuthenticationMethod*): Self = StObject.set(x, "microsoftAuthenticatorMethods", js.Array(value*))
    
    inline def setOperations(value: NullableOption[js.Array[LongRunningOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: LongRunningOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setPasswordMethods(value: NullableOption[js.Array[PasswordAuthenticationMethod]]): Self = StObject.set(x, "passwordMethods", value.asInstanceOf[js.Any])
    
    inline def setPasswordMethodsNull: Self = StObject.set(x, "passwordMethods", null)
    
    inline def setPasswordMethodsUndefined: Self = StObject.set(x, "passwordMethods", js.undefined)
    
    inline def setPasswordMethodsVarargs(value: PasswordAuthenticationMethod*): Self = StObject.set(x, "passwordMethods", js.Array(value*))
    
    inline def setPhoneMethods(value: NullableOption[js.Array[PhoneAuthenticationMethod]]): Self = StObject.set(x, "phoneMethods", value.asInstanceOf[js.Any])
    
    inline def setPhoneMethodsNull: Self = StObject.set(x, "phoneMethods", null)
    
    inline def setPhoneMethodsUndefined: Self = StObject.set(x, "phoneMethods", js.undefined)
    
    inline def setPhoneMethodsVarargs(value: PhoneAuthenticationMethod*): Self = StObject.set(x, "phoneMethods", js.Array(value*))
    
    inline def setSoftwareOathMethods(value: NullableOption[js.Array[SoftwareOathAuthenticationMethod]]): Self = StObject.set(x, "softwareOathMethods", value.asInstanceOf[js.Any])
    
    inline def setSoftwareOathMethodsNull: Self = StObject.set(x, "softwareOathMethods", null)
    
    inline def setSoftwareOathMethodsUndefined: Self = StObject.set(x, "softwareOathMethods", js.undefined)
    
    inline def setSoftwareOathMethodsVarargs(value: SoftwareOathAuthenticationMethod*): Self = StObject.set(x, "softwareOathMethods", js.Array(value*))
    
    inline def setTemporaryAccessPassMethods(value: NullableOption[js.Array[TemporaryAccessPassAuthenticationMethod]]): Self = StObject.set(x, "temporaryAccessPassMethods", value.asInstanceOf[js.Any])
    
    inline def setTemporaryAccessPassMethodsNull: Self = StObject.set(x, "temporaryAccessPassMethods", null)
    
    inline def setTemporaryAccessPassMethodsUndefined: Self = StObject.set(x, "temporaryAccessPassMethods", js.undefined)
    
    inline def setTemporaryAccessPassMethodsVarargs(value: TemporaryAccessPassAuthenticationMethod*): Self = StObject.set(x, "temporaryAccessPassMethods", js.Array(value*))
    
    inline def setWindowsHelloForBusinessMethods(value: NullableOption[js.Array[WindowsHelloForBusinessAuthenticationMethod]]): Self = StObject.set(x, "windowsHelloForBusinessMethods", value.asInstanceOf[js.Any])
    
    inline def setWindowsHelloForBusinessMethodsNull: Self = StObject.set(x, "windowsHelloForBusinessMethods", null)
    
    inline def setWindowsHelloForBusinessMethodsUndefined: Self = StObject.set(x, "windowsHelloForBusinessMethods", js.undefined)
    
    inline def setWindowsHelloForBusinessMethodsVarargs(value: WindowsHelloForBusinessAuthenticationMethod*): Self = StObject.set(x, "windowsHelloForBusinessMethods", js.Array(value*))
  }
}
