package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosAppCrashed extends StObject {
  
  /** The stack trace, if one is available. Optional. */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
}
object IosAppCrashed {
  
  @scala.inline
  def apply(): IosAppCrashed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosAppCrashed]
  }
  
  @scala.inline
  implicit class IosAppCrashedMutableBuilder[Self <: IosAppCrashed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
