package typings.meteor

import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.Error
import typings.meteor.Meteor.User
import typings.meteor.anon.Digest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accounts {
  
  trait IValidateLoginAttemptCbOpts extends StObject {
    
    var allowed: Boolean
    
    var connection: Connection
    
    var error: Error
    
    var methodArguments: js.Array[js.Any]
    
    var methodName: String
    
    var `type`: String
    
    var user: User
  }
  object IValidateLoginAttemptCbOpts {
    
    inline def apply(
      allowed: Boolean,
      connection: Connection,
      error: Error,
      methodArguments: js.Array[js.Any],
      methodName: String,
      `type`: String,
      user: User
    ): IValidateLoginAttemptCbOpts = {
      val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], methodArguments = methodArguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
    }
    
    extension [Self <: IValidateLoginAttemptCbOpts](x: Self) {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMethodArguments(value: js.Array[js.Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
      
      inline def setMethodArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "methodArguments", js.Array(value :_*))
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoginMethodOptions extends StObject {
    
    /**
      * The arguments for the method
      */
    var methodArguments: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * The method to call (default 'login')
      */
    var methodName: js.UndefOr[String] = js.undefined
    
    /**
      * Will be called with no arguments once the user is fully
      * logged in, or with the error on error.
      */
    var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.undefined
    
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
    
    extension [Self <: LoginMethodOptions](x: Self) {
      
      inline def setMethodArguments(value: js.Array[js.Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
      
      inline def setMethodArgumentsUndefined: Self = StObject.set(x, "methodArguments", js.undefined)
      
      inline def setMethodArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "methodArguments", js.Array(value :_*))
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
      
      inline def setUserCallback(value: /* err */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "userCallback", js.Any.fromFunction1(value))
      
      inline def setUserCallbackUndefined: Self = StObject.set(x, "userCallback", js.undefined)
      
      inline def setValidateResult(value: js.Function): Self = StObject.set(x, "validateResult", value.asInstanceOf[js.Any])
      
      inline def setValidateResultUndefined: Self = StObject.set(x, "validateResult", js.undefined)
    }
  }
  
  type Password = String | Digest
}
