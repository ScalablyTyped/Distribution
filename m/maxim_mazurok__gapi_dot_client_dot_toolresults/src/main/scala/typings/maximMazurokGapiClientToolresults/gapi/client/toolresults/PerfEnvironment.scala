package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerfEnvironment extends StObject {
  
  /** CPU related environment info */
  var cpuInfo: js.UndefOr[CPUInfo] = js.undefined
  
  /** Memory related environment info */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.undefined
}
object PerfEnvironment {
  
  inline def apply(): PerfEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerfEnvironment] (val x: Self) extends AnyVal {
    
    inline def setCpuInfo(value: CPUInfo): Self = StObject.set(x, "cpuInfo", value.asInstanceOf[js.Any])
    
    inline def setCpuInfoUndefined: Self = StObject.set(x, "cpuInfo", js.undefined)
    
    inline def setMemoryInfo(value: MemoryInfo): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
  }
}
