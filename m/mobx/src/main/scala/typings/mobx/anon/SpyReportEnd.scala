package typings.mobx.anon

import typings.mobx.distCoreSpyMod._PureSpyEvent
import typings.mobx.mobxBooleans.`true`
import typings.mobx.mobxStrings.`report-end`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpyReportEnd
  extends StObject
     with _PureSpyEvent {
  
  var spyReportEnd: `true`
  
  var time: js.UndefOr[Double] = js.undefined
  
  var `type`: `report-end`
}
object SpyReportEnd {
  
  inline def apply(): SpyReportEnd = {
    val __obj = js.Dynamic.literal(spyReportEnd = true)
    __obj.updateDynamic("type")("report-end")
    __obj.asInstanceOf[SpyReportEnd]
  }
  
  extension [Self <: SpyReportEnd](x: Self) {
    
    inline def setSpyReportEnd(value: `true`): Self = StObject.set(x, "spyReportEnd", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: `report-end`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
