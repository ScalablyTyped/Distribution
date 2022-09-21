package typings.metro.anon

import typings.metro.metroStrings.dep_graph_loading
import typings.metro.reportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasReducedPerformanceType
  extends StObject
     with ReportableEvent {
  
  var hasReducedPerformance: Boolean
  
  var `type`: dep_graph_loading
}
object HasReducedPerformanceType {
  
  inline def apply(hasReducedPerformance: Boolean): HasReducedPerformanceType = {
    val __obj = js.Dynamic.literal(hasReducedPerformance = hasReducedPerformance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dep_graph_loading")
    __obj.asInstanceOf[HasReducedPerformanceType]
  }
  
  extension [Self <: HasReducedPerformanceType](x: Self) {
    
    inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
    
    inline def setType(value: dep_graph_loading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
