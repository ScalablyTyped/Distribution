package typings.metro.anon

import typings.metro.metroStrings.global_cache_error
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorError
  extends StObject
     with ReportableEvent {
  
  var error: js.Error
  
  var `type`: global_cache_error
}
object ErrorError {
  
  inline def apply(error: js.Error): ErrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("global_cache_error")
    __obj.asInstanceOf[ErrorError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorError] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: global_cache_error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
