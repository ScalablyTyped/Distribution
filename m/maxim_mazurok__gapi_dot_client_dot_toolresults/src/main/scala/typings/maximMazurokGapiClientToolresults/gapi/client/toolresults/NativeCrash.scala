package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeCrash extends StObject {
  
  /** The stack trace of the native crash. Optional. */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
}
object NativeCrash {
  
  inline def apply(): NativeCrash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeCrash]
  }
  
  extension [Self <: NativeCrash](x: Self) {
    
    inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
