package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfEnvironment extends StObject {
  
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
  implicit class PerfEnvironmentMutableBuilder[Self <: PerfEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuInfo(value: CPUInfo): Self = StObject.set(x, "cpuInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuInfoUndefined: Self = StObject.set(x, "cpuInfo", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
  }
}
