package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfEnvironment extends js.Object {
  
  /** CPU related environment info */
  var cpuInfo: js.UndefOr[CPUInfo] = js.native
  
  /** Memory related environment info */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.native
}
object PerfEnvironment {
  
  @scala.inline
  def apply(): PerfEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfEnvironment]
  }
  
  @scala.inline
  implicit class PerfEnvironmentOps[Self <: PerfEnvironment] (val x: Self) extends AnyVal {
    
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
    def setCpuInfo(value: CPUInfo): Self = this.set("cpuInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuInfo: Self = this.set("cpuInfo", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = this.set("memoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInfo: Self = this.set("memoryInfo", js.undefined)
  }
}
