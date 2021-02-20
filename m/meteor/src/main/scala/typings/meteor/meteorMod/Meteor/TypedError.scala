package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedError
  extends typings.std.Error {
  
  var errorType: String = js.native
}
object TypedError {
  
  @JSImport("meteor/meteor", "Meteor.TypedError")
  @js.native
  val ^ : TypedErrorStatic = js.native
  
  @scala.inline
  implicit class TypedErrorMutableBuilder[Self <: TypedError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
  }
}
