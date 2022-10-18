package typings.metro.anon

import typings.metro.libReportingMod.ReportableEvent
import typings.metro.metroStrings.dep_graph_loaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with ReportableEvent {
  
  var `type`: dep_graph_loaded
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dep_graph_loaded")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: dep_graph_loaded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
