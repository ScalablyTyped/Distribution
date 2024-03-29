package typings.metro.anon

import typings.metro.metroStrings.hmr_client_error
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorErrorType
  extends StObject
     with ReportableEvent {
  
  var error: js.Error
  
  var `type`: hmr_client_error
}
object ErrorErrorType {
  
  inline def apply(error: js.Error): ErrorErrorType = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hmr_client_error")
    __obj.asInstanceOf[ErrorErrorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorErrorType] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: hmr_client_error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
