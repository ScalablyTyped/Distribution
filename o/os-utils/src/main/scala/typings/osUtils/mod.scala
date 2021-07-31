package typings.osUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("os-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def allLoadavg(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("allLoadavg")().asInstanceOf[String]
  
  @scala.inline
  def cpuCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuCount")().asInstanceOf[Double]
  
  @scala.inline
  def cpuFree(callback: js.Function1[/* percentage */ Double, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuFree")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def cpuUsage(callback: js.Function1[/* percentage */ Double, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def freeCommand(callback: js.Function1[/* used_mem */ Double, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeCommand")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def freemem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freemem")().asInstanceOf[Double]
  
  @scala.inline
  def freememPercentage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freememPercentage")().asInstanceOf[Double]
  
  @scala.inline
  def getProcesses(callback: js.Function1[/* result */ String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProcesses")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def getProcesses(nProcess: Double, callback: js.Function1[/* result */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcesses")(nProcess.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def harddrive(callback: js.Function3[/* total */ Double, /* free */ Double, /* used */ Double, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("harddrive")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def loadavg(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")().asInstanceOf[Double]
  @scala.inline
  def loadavg(_time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")(_time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def platform(): Platform_ = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")().asInstanceOf[Platform_]
  
  @scala.inline
  def processUptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processUptime")().asInstanceOf[Double]
  
  @scala.inline
  def sysUptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sysUptime")().asInstanceOf[Double]
  
  @scala.inline
  def totalmem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalmem")().asInstanceOf[Double]
  
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
    
    @scala.inline
    def aix: typings.osUtils.osUtilsStrings.aix = "aix".asInstanceOf[typings.osUtils.osUtilsStrings.aix]
    
    @scala.inline
    def android: typings.osUtils.osUtilsStrings.android = "android".asInstanceOf[typings.osUtils.osUtilsStrings.android]
    
    @scala.inline
    def cygwin: typings.osUtils.osUtilsStrings.cygwin = "cygwin".asInstanceOf[typings.osUtils.osUtilsStrings.cygwin]
    
    @scala.inline
    def darwin: typings.osUtils.osUtilsStrings.darwin = "darwin".asInstanceOf[typings.osUtils.osUtilsStrings.darwin]
    
    @scala.inline
    def freebsd: typings.osUtils.osUtilsStrings.freebsd = "freebsd".asInstanceOf[typings.osUtils.osUtilsStrings.freebsd]
    
    @scala.inline
    def linux: typings.osUtils.osUtilsStrings.linux = "linux".asInstanceOf[typings.osUtils.osUtilsStrings.linux]
    
    @scala.inline
    def openbsd: typings.osUtils.osUtilsStrings.openbsd = "openbsd".asInstanceOf[typings.osUtils.osUtilsStrings.openbsd]
    
    @scala.inline
    def sunos: typings.osUtils.osUtilsStrings.sunos = "sunos".asInstanceOf[typings.osUtils.osUtilsStrings.sunos]
    
    @scala.inline
    def win32: typings.osUtils.osUtilsStrings.win32 = "win32".asInstanceOf[typings.osUtils.osUtilsStrings.win32]
  }
}
