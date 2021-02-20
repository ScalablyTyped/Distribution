package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeCrash extends StObject {
  
  /** The stack trace of the native crash. Optional. */
  var stackTrace: js.UndefOr[StackTrace] = js.native
}
object NativeCrash {
  
  @scala.inline
  def apply(): NativeCrash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeCrash]
  }
  
  @scala.inline
  implicit class NativeCrashMutableBuilder[Self <: NativeCrash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
