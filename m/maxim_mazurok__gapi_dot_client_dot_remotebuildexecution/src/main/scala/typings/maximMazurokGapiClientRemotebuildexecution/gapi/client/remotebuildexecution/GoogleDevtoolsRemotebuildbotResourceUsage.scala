package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildbotResourceUsage extends StObject {
  
  var cpuUsedPercent: js.UndefOr[Double] = js.undefined
  
  var diskUsage: js.UndefOr[GoogleDevtoolsRemotebuildbotResourceUsageStat] = js.undefined
  
  var memoryUsage: js.UndefOr[GoogleDevtoolsRemotebuildbotResourceUsageStat] = js.undefined
  
  var totalDiskIoStats: js.UndefOr[GoogleDevtoolsRemotebuildbotResourceUsageIOStats] = js.undefined
}
object GoogleDevtoolsRemotebuildbotResourceUsage {
  
  inline def apply(): GoogleDevtoolsRemotebuildbotResourceUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotResourceUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDevtoolsRemotebuildbotResourceUsage] (val x: Self) extends AnyVal {
    
    inline def setCpuUsedPercent(value: Double): Self = StObject.set(x, "cpuUsedPercent", value.asInstanceOf[js.Any])
    
    inline def setCpuUsedPercentUndefined: Self = StObject.set(x, "cpuUsedPercent", js.undefined)
    
    inline def setDiskUsage(value: GoogleDevtoolsRemotebuildbotResourceUsageStat): Self = StObject.set(x, "diskUsage", value.asInstanceOf[js.Any])
    
    inline def setDiskUsageUndefined: Self = StObject.set(x, "diskUsage", js.undefined)
    
    inline def setMemoryUsage(value: GoogleDevtoolsRemotebuildbotResourceUsageStat): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
    
    inline def setMemoryUsageUndefined: Self = StObject.set(x, "memoryUsage", js.undefined)
    
    inline def setTotalDiskIoStats(value: GoogleDevtoolsRemotebuildbotResourceUsageIOStats): Self = StObject.set(x, "totalDiskIoStats", value.asInstanceOf[js.Any])
    
    inline def setTotalDiskIoStatsUndefined: Self = StObject.set(x, "totalDiskIoStats", js.undefined)
  }
}
