package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedError
  extends StObject
     with typings.std.Error {
  
  var errorType: String
}
object TypedError {
  
  @JSImport("meteor/meteor", "Meteor.TypedError")
  @js.native
  val ^ : TypedErrorStatic = js.native
  
  extension [Self <: TypedError](x: Self) {
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
  }
}
