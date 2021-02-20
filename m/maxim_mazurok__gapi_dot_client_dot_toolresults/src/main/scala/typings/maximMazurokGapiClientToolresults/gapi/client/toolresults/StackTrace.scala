package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackTrace extends StObject {
  
  /** The stack trace message. Required */
  var exception: js.UndefOr[String] = js.native
}
object StackTrace {
  
  @scala.inline
  def apply(): StackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackTrace]
  }
  
  @scala.inline
  implicit class StackTraceMutableBuilder[Self <: StackTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
  }
}
