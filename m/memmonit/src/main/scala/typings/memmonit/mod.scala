package typings.memmonit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memmonit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object MemoryMonitoring extends js.Object {
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total
      */
    def getMemoryTotal(unit: String): Double = js.native
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total fixed
      */
    def getMemoryTotalFixed(unit: String, value: Double): Double = js.native
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total truncated
      */
    def getMemoryTotalTrunc(unit: String): Double = js.native
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory Usage
      */
    def getMemoryUsage(unit: String): Double = js.native
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value used fixed
      */
    def getMemoryUsageFixed(unit: String, value: Double): Double = js.native
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value used truncated
      */
    def memoryUsageTrunc(unit: String): Double = js.native
  }
  
  @js.native
  object RegisterMonitoring extends js.Object {
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    def registerMemoryUsage(file: String, unit: String): Unit = js.native
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    def registerMemoryUsageFixed(file: String, unit: String): Unit = js.native
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    def registerMemoryUsageTrunc(file: String, unit: String): Unit = js.native
  }
}
