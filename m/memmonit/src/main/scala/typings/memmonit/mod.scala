package typings.memmonit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object MemoryMonitoring {
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total
      */
    @JSImport("memmonit", "MemoryMonitoring.getMemoryTotal")
    @js.native
    def getMemoryTotal(unit: String): Double = js.native
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total fixed
      */
    @JSImport("memmonit", "MemoryMonitoring.getMemoryTotalFixed")
    @js.native
    def getMemoryTotalFixed(unit: String, value: Double): Double = js.native
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total truncated
      */
    @JSImport("memmonit", "MemoryMonitoring.getMemoryTotalTrunc")
    @js.native
    def getMemoryTotalTrunc(unit: String): Double = js.native
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory Usage
      */
    @JSImport("memmonit", "MemoryMonitoring.getMemoryUsage")
    @js.native
    def getMemoryUsage(unit: String): Double = js.native
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value used fixed
      */
    @JSImport("memmonit", "MemoryMonitoring.getMemoryUsageFixed")
    @js.native
    def getMemoryUsageFixed(unit: String, value: Double): Double = js.native
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value used truncated
      */
    @JSImport("memmonit", "MemoryMonitoring.memoryUsageTrunc")
    @js.native
    def memoryUsageTrunc(unit: String): Double = js.native
  }
  
  object RegisterMonitoring {
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    @JSImport("memmonit", "RegisterMonitoring.registerMemoryUsage")
    @js.native
    def registerMemoryUsage(file: String, unit: String): Unit = js.native
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    @JSImport("memmonit", "RegisterMonitoring.registerMemoryUsageFixed")
    @js.native
    def registerMemoryUsageFixed(file: String, unit: String): Unit = js.native
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    @JSImport("memmonit", "RegisterMonitoring.registerMemoryUsageTrunc")
    @js.native
    def registerMemoryUsageTrunc(file: String, unit: String): Unit = js.native
  }
}
