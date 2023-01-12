package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedError
  extends StObject
     with typings.std.Error {
  
  var errorType: String
}
object TypedError {
  
  inline def apply(errorType: String, message: String, name: String): TypedError = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypedError] (val x: Self) extends AnyVal {
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
  }
}
