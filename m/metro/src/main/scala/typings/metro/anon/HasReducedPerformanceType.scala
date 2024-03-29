package typings.metro.anon

import typings.metro.metroStrings.dep_graph_loading
import typings.metro.srcLibReportingMod.ReportableEvent
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasReducedPerformanceType] (val x: Self) extends AnyVal {
    
    inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
    
    inline def setType(value: dep_graph_loading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
