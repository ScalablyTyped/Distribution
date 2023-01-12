package typings.metro.anon

import typings.metro.libReportingMod.ReportableEvent
import typings.metro.metroStrings.initialize_started
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasReducedPerformance
  extends StObject
     with ReportableEvent {
  
  var hasReducedPerformance: Boolean
  
  var port: Double
  
  var `type`: initialize_started
}
object HasReducedPerformance {
  
  inline def apply(hasReducedPerformance: Boolean, port: Double): HasReducedPerformance = {
    val __obj = js.Dynamic.literal(hasReducedPerformance = hasReducedPerformance.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("initialize_started")
    __obj.asInstanceOf[HasReducedPerformance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasReducedPerformance] (val x: Self) extends AnyVal {
    
    inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setType(value: initialize_started): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
