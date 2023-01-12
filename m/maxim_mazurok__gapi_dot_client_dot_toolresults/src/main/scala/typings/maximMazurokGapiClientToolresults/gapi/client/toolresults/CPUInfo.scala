package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPUInfo extends StObject {
  
  /** description of the device processor ie '1.8 GHz hexa core 64-bit ARMv8-A' */
  var cpuProcessor: js.UndefOr[String] = js.undefined
  
  /** the CPU clock speed in GHz */
  var cpuSpeedInGhz: js.UndefOr[Double] = js.undefined
  
  /** the number of CPU cores */
  var numberOfCores: js.UndefOr[Double] = js.undefined
}
object CPUInfo {
  
  inline def apply(): CPUInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CPUInfo] (val x: Self) extends AnyVal {
    
    inline def setCpuProcessor(value: String): Self = StObject.set(x, "cpuProcessor", value.asInstanceOf[js.Any])
    
    inline def setCpuProcessorUndefined: Self = StObject.set(x, "cpuProcessor", js.undefined)
    
    inline def setCpuSpeedInGhz(value: Double): Self = StObject.set(x, "cpuSpeedInGhz", value.asInstanceOf[js.Any])
    
    inline def setCpuSpeedInGhzUndefined: Self = StObject.set(x, "cpuSpeedInGhz", js.undefined)
    
    inline def setNumberOfCores(value: Double): Self = StObject.set(x, "numberOfCores", value.asInstanceOf[js.Any])
    
    inline def setNumberOfCoresUndefined: Self = StObject.set(x, "numberOfCores", js.undefined)
  }
}
