package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAuthenticatorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/security/UserAuthenticator", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with UserAuthenticator {
    
    /* private */ /* CompleteClass */
    var _isKeyOfGroupOrUser: Any = js.native
    
    /* private */ /* CompleteClass */
    var _messages: Any = js.native
    
    /* private */ /* CompleteClass */
    var authenticateUser: Any = js.native
    
    /* CompleteClass */
    var defaultPasswordRule: Any = js.native
    
    /* CompleteClass */
    override def getResultMessage(authResult: Any): Any = js.native
    
    /* CompleteClass */
    var userPolicyKey: Double = js.native
    
    /* CompleteClass */
    override def validateUserAccess(userId: String, remoteAddress: String): Double = js.native
  }
  @JSImport("@nginstack/web-framework/lib/security/UserAuthenticator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/security/UserAuthenticator", "LOGIN_FAIL")
  @js.native
  val LOGIN_FAIL: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/security/UserAuthenticator", "OK")
  @js.native
  val OK: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/security/UserAuthenticator", "PASSWORD_EXPIRED")
  @js.native
  val PASSWORD_EXPIRED: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/security/UserAuthenticator", "USER_LOCKED")
  @js.native
  val USER_LOCKED: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/security/UserAuthenticator", "USER_NOT_EXISTS")
  @js.native
  val USER_NOT_EXISTS: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/security/UserAuthenticator", "WITHOUT_PERMISSION")
  @js.native
  val WITHOUT_PERMISSION: Double = js.native
  
  trait UserAuthenticator extends StObject {
    
    /* private */ var _isKeyOfGroupOrUser: Any
    
    /* private */ var _messages: Any
    
    /* private */ var authenticateUser: Any
    
    var defaultPasswordRule: Any
    
    def getResultMessage(authResult: Any): Any
    
    var userPolicyKey: Double
    
    def validateUserAccess(userId: String, remoteAddress: String): Double
  }
  object UserAuthenticator {
    
    inline def apply(
      _isKeyOfGroupOrUser: Any,
      _messages: Any,
      authenticateUser: Any,
      defaultPasswordRule: Any,
      getResultMessage: Any => Any,
      userPolicyKey: Double,
      validateUserAccess: (String, String) => Double
    ): UserAuthenticator = {
      val __obj = js.Dynamic.literal(_isKeyOfGroupOrUser = _isKeyOfGroupOrUser.asInstanceOf[js.Any], _messages = _messages.asInstanceOf[js.Any], authenticateUser = authenticateUser.asInstanceOf[js.Any], defaultPasswordRule = defaultPasswordRule.asInstanceOf[js.Any], getResultMessage = js.Any.fromFunction1(getResultMessage), userPolicyKey = userPolicyKey.asInstanceOf[js.Any], validateUserAccess = js.Any.fromFunction2(validateUserAccess))
      __obj.asInstanceOf[UserAuthenticator]
    }
    
    extension [Self <: UserAuthenticator](x: Self) {
      
      inline def setAuthenticateUser(value: Any): Self = StObject.set(x, "authenticateUser", value.asInstanceOf[js.Any])
      
      inline def setDefaultPasswordRule(value: Any): Self = StObject.set(x, "defaultPasswordRule", value.asInstanceOf[js.Any])
      
      inline def setGetResultMessage(value: Any => Any): Self = StObject.set(x, "getResultMessage", js.Any.fromFunction1(value))
      
      inline def setUserPolicyKey(value: Double): Self = StObject.set(x, "userPolicyKey", value.asInstanceOf[js.Any])
      
      inline def setValidateUserAccess(value: (String, String) => Double): Self = StObject.set(x, "validateUserAccess", js.Any.fromFunction2(value))
      
      inline def set_isKeyOfGroupOrUser(value: Any): Self = StObject.set(x, "_isKeyOfGroupOrUser", value.asInstanceOf[js.Any])
      
      inline def set_messages(value: Any): Self = StObject.set(x, "_messages", value.asInstanceOf[js.Any])
    }
  }
}
