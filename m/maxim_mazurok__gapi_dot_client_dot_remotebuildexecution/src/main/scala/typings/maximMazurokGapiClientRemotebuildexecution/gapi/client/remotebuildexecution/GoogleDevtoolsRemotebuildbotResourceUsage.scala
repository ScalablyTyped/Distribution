package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildbotResourceUsage extends StObject {
  
  var cpuUsedPercent: js.UndefOr[Double] = js.native
  
  var diskUsage: js.UndefOr[GoogleDevtoolsRemotebuildbotResourceUsageStat] = js.native
  
  var memoryUsage: js.UndefOr[GoogleDevtoolsRemotebuildbotResourceUsageStat] = js.native
}
object GoogleDevtoolsRemotebuildbotResourceUsage {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildbotResourceUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotResourceUsage]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildbotResourceUsageMutableBuilder[Self <: GoogleDevtoolsRemotebuildbotResourceUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuUsedPercent(value: Double): Self = StObject.set(x, "cpuUsedPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUsedPercentUndefined: Self = StObject.set(x, "cpuUsedPercent", js.undefined)
    
    @scala.inline
    def setDiskUsage(value: GoogleDevtoolsRemotebuildbotResourceUsageStat): Self = StObject.set(x, "diskUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskUsageUndefined: Self = StObject.set(x, "diskUsage", js.undefined)
    
    @scala.inline
    def setMemoryUsage(value: GoogleDevtoolsRemotebuildbotResourceUsageStat): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUsageUndefined: Self = StObject.set(x, "memoryUsage", js.undefined)
  }
}
