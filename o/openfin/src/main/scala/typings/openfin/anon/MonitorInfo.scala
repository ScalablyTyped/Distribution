package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorInfo extends StObject {
  
  var monitorInfo: typings.openfin.monitorMod.MonitorInfo
  
  var runtimeInfo: String
  
  var timeStamp: String
}
object MonitorInfo {
  
  inline def apply(monitorInfo: typings.openfin.monitorMod.MonitorInfo, runtimeInfo: String, timeStamp: String): MonitorInfo = {
    val __obj = js.Dynamic.literal(monitorInfo = monitorInfo.asInstanceOf[js.Any], runtimeInfo = runtimeInfo.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfo]
  }
  
  extension [Self <: MonitorInfo](x: Self) {
    
    inline def setMonitorInfo(value: typings.openfin.monitorMod.MonitorInfo): Self = StObject.set(x, "monitorInfo", value.asInstanceOf[js.Any])
    
    inline def setRuntimeInfo(value: String): Self = StObject.set(x, "runtimeInfo", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
