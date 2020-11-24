package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildbotResourceUsage extends js.Object {
  
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
  implicit class GoogleDevtoolsRemotebuildbotResourceUsageOps[Self <: GoogleDevtoolsRemotebuildbotResourceUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCpuUsedPercent(value: Double): Self = this.set("cpuUsedPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuUsedPercent: Self = this.set("cpuUsedPercent", js.undefined)
    
    @scala.inline
    def setDiskUsage(value: GoogleDevtoolsRemotebuildbotResourceUsageStat): Self = this.set("diskUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskUsage: Self = this.set("diskUsage", js.undefined)
    
    @scala.inline
    def setMemoryUsage(value: GoogleDevtoolsRemotebuildbotResourceUsageStat): Self = this.set("memoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryUsage: Self = this.set("memoryUsage", js.undefined)
  }
}
