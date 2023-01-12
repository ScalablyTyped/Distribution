package typings.meteorTypings

import typings.meteorTypings.Meteor.Connection
import typings.meteorTypings.Meteor.Error
import typings.meteorTypings.Meteor.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accounts {
  
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
}
