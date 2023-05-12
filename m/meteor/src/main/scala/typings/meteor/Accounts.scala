package typings.meteor

import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.Error
import typings.meteor.Meteor.User
import typings.meteor.anon.Digest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accounts {
  
  trait HashedStampedLoginToken extends StObject {
    
    var hashedToken: String
    
    var when: js.Date
  }
  object HashedStampedLoginToken {
    
    inline def apply(hashedToken: String, when: js.Date): HashedStampedLoginToken = {
      val __obj = js.Dynamic.literal(hashedToken = hashedToken.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashedStampedLoginToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashedStampedLoginToken] (val x: Self) extends AnyVal {
      
      inline def setHashedToken(value: String): Self = StObject.set(x, "hashedToken", value.asInstanceOf[js.Any])
      
      inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    }
  }
  
  trait IValidateLoginAttemptCbOpts extends StObject {
    
    var allowed: Boolean
    
    var connection: Connection
    
    var error: Error
    
    var methodArguments: js.Array[Any]
    
    var methodName: String
    
    var `type`: String
    
    var user: User
  }
  object IValidateLoginAttemptCbOpts {
    
    inline def apply(
      allowed: Boolean,
      connection: Connection,
      error: Error,
      methodArguments: js.Array[Any],
      methodName: String,
      `type`: String,
      user: User
    ): IValidateLoginAttemptCbOpts = {
      val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], methodArguments = methodArguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IValidateLoginAttemptCbOpts] (val x: Self) extends AnyVal {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMethodArguments(value: js.Array[Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
      
      inline def setMethodArgumentsVarargs(value: Any*): Self = StObject.set(x, "methodArguments", js.Array(value*))
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoginMethodOptions extends StObject {
    
    /**
      * The arguments for the method
      */
    var methodArguments: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The method to call (default 'login')
      */
    var methodName: js.UndefOr[String] = js.undefined
    
    /**
      * Will be called with no arguments once the user is fully
      * logged in, or with the error on error.
      */
    var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * If provided, will be called with the result of the
      * method. If it throws, the client will not be logged in (and
      * its error will be passed to the callback).
      */
    var validateResult: js.UndefOr[js.Function] = js.undefined
  }
  object LoginMethodOptions {
    
    inline def apply(): LoginMethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoginMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoginMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setMethodArguments(value: js.Array[Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
      
      inline def setMethodArgumentsUndefined: Self = StObject.set(x, "methodArguments", js.undefined)
      
      inline def setMethodArgumentsVarargs(value: Any*): Self = StObject.set(x, "methodArguments", js.Array(value*))
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
      
      inline def setUserCallback(value: /* err */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "userCallback", js.Any.fromFunction1(value))
      
      inline def setUserCallbackUndefined: Self = StObject.set(x, "userCallback", js.undefined)
      
      inline def setValidateResult(value: js.Function): Self = StObject.set(x, "validateResult", value.asInstanceOf[js.Any])
      
      inline def setValidateResultUndefined: Self = StObject.set(x, "validateResult", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.meteor.anon.Error
    - typings.meteor.anon.StampedLoginToken
  */
  trait LoginMethodResult extends StObject
  object LoginMethodResult {
    
    inline def Error(error: js.Error): typings.meteor.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteor.anon.Error]
    }
    
    inline def StampedLoginToken(userId: String): typings.meteor.anon.StampedLoginToken = {
      val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteor.anon.StampedLoginToken]
    }
  }
  
  type Password = String | Digest
  
  /* Rewritten from type alias, can be one of: 
    - typings.meteor.meteorStrings.USERNAME_AND_EMAIL
    - typings.meteor.meteorStrings.USERNAME_AND_OPTIONAL_EMAIL
    - typings.meteor.meteorStrings.USERNAME_ONLY
    - typings.meteor.meteorStrings.EMAIL_ONLY
  */
  trait PasswordSignupField extends StObject
  object PasswordSignupField {
    
    inline def EMAIL_ONLY: typings.meteor.meteorStrings.EMAIL_ONLY = "EMAIL_ONLY".asInstanceOf[typings.meteor.meteorStrings.EMAIL_ONLY]
    
    inline def USERNAME_AND_EMAIL: typings.meteor.meteorStrings.USERNAME_AND_EMAIL = "USERNAME_AND_EMAIL".asInstanceOf[typings.meteor.meteorStrings.USERNAME_AND_EMAIL]
    
    inline def USERNAME_AND_OPTIONAL_EMAIL: typings.meteor.meteorStrings.USERNAME_AND_OPTIONAL_EMAIL = "USERNAME_AND_OPTIONAL_EMAIL".asInstanceOf[typings.meteor.meteorStrings.USERNAME_AND_OPTIONAL_EMAIL]
    
    inline def USERNAME_ONLY: typings.meteor.meteorStrings.USERNAME_ONLY = "USERNAME_ONLY".asInstanceOf[typings.meteor.meteorStrings.USERNAME_ONLY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.meteor.meteorStrings.USERNAME_AND_EMAIL
    - typings.meteor.meteorStrings.EMAIL_ONLY
  */
  trait PasswordlessSignupField extends StObject
  object PasswordlessSignupField {
    
    inline def EMAIL_ONLY: typings.meteor.meteorStrings.EMAIL_ONLY = "EMAIL_ONLY".asInstanceOf[typings.meteor.meteorStrings.EMAIL_ONLY]
    
    inline def USERNAME_AND_EMAIL: typings.meteor.meteorStrings.USERNAME_AND_EMAIL = "USERNAME_AND_EMAIL".asInstanceOf[typings.meteor.meteorStrings.USERNAME_AND_EMAIL]
  }
  
  trait StampedLoginToken extends StObject {
    
    var token: String
    
    var when: js.Date
  }
  object StampedLoginToken {
    
    inline def apply(token: String, when: js.Date): StampedLoginToken = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.asInstanceOf[StampedLoginToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StampedLoginToken] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    }
  }
}
