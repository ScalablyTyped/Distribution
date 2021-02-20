package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorError extends StObject {
  
  var error: typings.std.Error = js.native
}
object ErrorError {
  
  @scala.inline
  def apply(error: typings.std.Error): ErrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorError]
  }
  
  @scala.inline
  implicit class ErrorErrorMutableBuilder[Self <: ErrorError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
