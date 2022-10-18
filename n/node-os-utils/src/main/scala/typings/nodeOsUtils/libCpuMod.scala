package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCpuMod {
  
  @JSImport("node-os-utils/lib/cpu", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Cpu
  
  @js.native
  trait Cpu extends StObject {
    
    def average(): CpuAverageInfo = js.native
    
    def count(): Double = js.native
    
    def free(): js.Promise[Double] = js.native
    def free(interval: Double): js.Promise[Double] = js.native
    
    def loadavg(): js.Array[Double] = js.native
    
    def loadavgTime(time: String): Double = js.native
    def loadavgTime(time: Double): Double = js.native
    
    def model(): String = js.native
    
    def usage(): js.Promise[Double] = js.native
    def usage(interval: Double): js.Promise[Double] = js.native
  }
  
  trait CpuAverageInfo extends StObject {
    
    var avgIdle: Double
    
    var avgTotal: Double
    
    var totalIdle: Double
    
    var totalTick: Double
  }
  object CpuAverageInfo {
    
    inline def apply(avgIdle: Double, avgTotal: Double, totalIdle: Double, totalTick: Double): CpuAverageInfo = {
      val __obj = js.Dynamic.literal(avgIdle = avgIdle.asInstanceOf[js.Any], avgTotal = avgTotal.asInstanceOf[js.Any], totalIdle = totalIdle.asInstanceOf[js.Any], totalTick = totalTick.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuAverageInfo]
    }
    
    extension [Self <: CpuAverageInfo](x: Self) {
      
      inline def setAvgIdle(value: Double): Self = StObject.set(x, "avgIdle", value.asInstanceOf[js.Any])
      
      inline def setAvgTotal(value: Double): Self = StObject.set(x, "avgTotal", value.asInstanceOf[js.Any])
      
      inline def setTotalIdle(value: Double): Self = StObject.set(x, "totalIdle", value.asInstanceOf[js.Any])
      
      inline def setTotalTick(value: Double): Self = StObject.set(x, "totalTick", value.asInstanceOf[js.Any])
    }
  }
}
