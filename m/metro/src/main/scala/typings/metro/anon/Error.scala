package typings.metro.anon

import typings.metro.libReportingMod.ReportableEvent
import typings.metro.metroStrings.initialize_failed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with ReportableEvent {
  
  var error: js.Error
  
  var port: Double
  
  var `type`: initialize_failed
}
object Error {
  
  inline def apply(error: js.Error, port: Double): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("initialize_failed")
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setType(value: initialize_failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
