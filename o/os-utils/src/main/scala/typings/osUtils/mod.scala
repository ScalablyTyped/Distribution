package typings.osUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("os-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allLoadavg(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("allLoadavg")().asInstanceOf[String]
  
  inline def cpuCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuCount")().asInstanceOf[Double]
  
  inline def cpuFree(callback: js.Function1[/* percentage */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuFree")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cpuUsage(callback: js.Function1[/* percentage */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeCommand(callback: js.Function1[/* used_mem */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeCommand")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freemem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freemem")().asInstanceOf[Double]
  
  inline def freememPercentage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freememPercentage")().asInstanceOf[Double]
  
  inline def getProcesses(callback: js.Function1[/* result */ String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProcesses")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getProcesses(nProcess: Double, callback: js.Function1[/* result */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcesses")(nProcess.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def harddrive(callback: js.Function3[/* total */ Double, /* free */ Double, /* used */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("harddrive")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def loadavg(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")().asInstanceOf[Double]
  inline def loadavg(_time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")(_time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def platform(): Platform_ = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")().asInstanceOf[Platform_]
  
  inline def processUptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processUptime")().asInstanceOf[Double]
  
  inline def sysUptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sysUptime")().asInstanceOf[Double]
  
  inline def totalmem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalmem")().asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.osUtils.osUtilsStrings.aix
    - typings.osUtils.osUtilsStrings.android
    - typings.osUtils.osUtilsStrings.darwin
    - typings.osUtils.osUtilsStrings.freebsd
    - typings.osUtils.osUtilsStrings.linux
    - typings.osUtils.osUtilsStrings.openbsd
    - typings.osUtils.osUtilsStrings.sunos
    - typings.osUtils.osUtilsStrings.win32
    - typings.osUtils.osUtilsStrings.cygwin
  */
  trait Platform_ extends StObject
  object Platform_ {
    
    inline def aix: typings.osUtils.osUtilsStrings.aix = "aix".asInstanceOf[typings.osUtils.osUtilsStrings.aix]
    
    inline def android: typings.osUtils.osUtilsStrings.android = "android".asInstanceOf[typings.osUtils.osUtilsStrings.android]
    
    inline def cygwin: typings.osUtils.osUtilsStrings.cygwin = "cygwin".asInstanceOf[typings.osUtils.osUtilsStrings.cygwin]
    
    inline def darwin: typings.osUtils.osUtilsStrings.darwin = "darwin".asInstanceOf[typings.osUtils.osUtilsStrings.darwin]
    
    inline def freebsd: typings.osUtils.osUtilsStrings.freebsd = "freebsd".asInstanceOf[typings.osUtils.osUtilsStrings.freebsd]
    
    inline def linux: typings.osUtils.osUtilsStrings.linux = "linux".asInstanceOf[typings.osUtils.osUtilsStrings.linux]
    
    inline def openbsd: typings.osUtils.osUtilsStrings.openbsd = "openbsd".asInstanceOf[typings.osUtils.osUtilsStrings.openbsd]
    
    inline def sunos: typings.osUtils.osUtilsStrings.sunos = "sunos".asInstanceOf[typings.osUtils.osUtilsStrings.sunos]
    
    inline def win32: typings.osUtils.osUtilsStrings.win32 = "win32".asInstanceOf[typings.osUtils.osUtilsStrings.win32]
  }
}
