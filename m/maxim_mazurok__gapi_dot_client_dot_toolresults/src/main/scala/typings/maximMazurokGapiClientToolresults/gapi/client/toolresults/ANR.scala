package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ANR extends StObject {
  
  /** The stack trace of the ANR crash. Optional. */
  var stackTrace: js.UndefOr[StackTrace] = js.native
}
object ANR {
  
  @scala.inline
  def apply(): ANR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ANR]
  }
  
  @scala.inline
  implicit class ANRMutableBuilder[Self <: ANR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
