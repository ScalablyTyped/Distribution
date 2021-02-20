package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FatalException extends StObject {
  
  /** The stack trace of the fatal exception. Optional. */
  var stackTrace: js.UndefOr[StackTrace] = js.native
}
object FatalException {
  
  @scala.inline
  def apply(): FatalException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FatalException]
  }
  
  @scala.inline
  implicit class FatalExceptionMutableBuilder[Self <: FatalException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
