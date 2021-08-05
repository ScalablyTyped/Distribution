package typings.memmonit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object MemoryMonitoring {
    
    @JSImport("memmonit", "MemoryMonitoring")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total
      */
    inline def getMemoryTotal(unit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoryTotal")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total fixed
      */
    inline def getMemoryTotalFixed(unit: String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMemoryTotalFixed")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the total memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value total truncated
      */
    inline def getMemoryTotalTrunc(unit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoryTotalTrunc")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory Usage
      */
    inline def getMemoryUsage(unit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoryUsage")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value used fixed
      */
    inline def getMemoryUsageFixed(unit: String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMemoryUsageFixed")(unit.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the amount of memory used.
      * @param unit Return measurement unit. Support GB, MB or kB
      * @returns Memory value used truncated
      */
    inline def memoryUsageTrunc(unit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryUsageTrunc")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  object RegisterMonitoring {
    
    @JSImport("memmonit", "RegisterMonitoring")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    inline def registerMemoryUsage(file: String, unit: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMemoryUsage")(file.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    inline def registerMemoryUsageFixed(file: String, unit: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMemoryUsageFixed")(file.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Writes the measurement to a file.
      * @param file Recording file
      * @param unit Return measurement unit. Support GB, MB or kB
      */
    inline def registerMemoryUsageTrunc(file: String, unit: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMemoryUsageTrunc")(file.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
