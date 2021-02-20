package typings.osUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("os-utils", "allLoadavg")
  @js.native
  def allLoadavg(): String = js.native
  
  @JSImport("os-utils", "cpuCount")
  @js.native
  def cpuCount(): Double = js.native
  
  @JSImport("os-utils", "cpuFree")
  @js.native
  def cpuFree(callback: js.Function1[/* percentage */ Double, _]): Unit = js.native
  
  @JSImport("os-utils", "cpuUsage")
  @js.native
  def cpuUsage(callback: js.Function1[/* percentage */ Double, _]): Unit = js.native
  
  @JSImport("os-utils", "freeCommand")
  @js.native
  def freeCommand(callback: js.Function1[/* used_mem */ Double, _]): Unit = js.native
  
  @JSImport("os-utils", "freemem")
  @js.native
  def freemem(): Double = js.native
  
  @JSImport("os-utils", "freememPercentage")
  @js.native
  def freememPercentage(): Double = js.native
  
  @JSImport("os-utils", "getProcesses")
  @js.native
  def getProcesses(callback: js.Function1[/* result */ String, _]): Unit = js.native
  @JSImport("os-utils", "getProcesses")
  @js.native
  def getProcesses(nProcess: Double, callback: js.Function1[/* result */ String, _]): Unit = js.native
  
  @JSImport("os-utils", "harddrive")
  @js.native
  def harddrive(callback: js.Function3[/* total */ Double, /* free */ Double, /* used */ Double, _]): Unit = js.native
  
  @JSImport("os-utils", "loadavg")
  @js.native
  def loadavg(): Double = js.native
  @JSImport("os-utils", "loadavg")
  @js.native
  def loadavg(_time: Double): Double = js.native
  
  @JSImport("os-utils", "platform")
  @js.native
  def platform(): Platform_ = js.native
  
  @JSImport("os-utils", "processUptime")
  @js.native
  def processUptime(): Double = js.native
  
  @JSImport("os-utils", "sysUptime")
  @js.native
  def sysUptime(): Double = js.native
  
  @JSImport("os-utils", "totalmem")
  @js.native
  def totalmem(): Double = js.native
  
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
