package typings.osDashUtils

import typings.osDashUtils.osDashUtilsMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os-utils", JSImport.Namespace)
@js.native
object osDashUtilsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.osDashUtils.osDashUtilsStrings.aix
    - typings.osDashUtils.osDashUtilsStrings.android
    - typings.osDashUtils.osDashUtilsStrings.darwin
    - typings.osDashUtils.osDashUtilsStrings.freebsd
    - typings.osDashUtils.osDashUtilsStrings.linux
    - typings.osDashUtils.osDashUtilsStrings.openbsd
    - typings.osDashUtils.osDashUtilsStrings.sunos
    - typings.osDashUtils.osDashUtilsStrings.win32
    - typings.osDashUtils.osDashUtilsStrings.cygwin
  */
  trait Platform extends js.Object
  
  def allLoadavg(): String = js.native
  def cpuCount(): Double = js.native
  def cpuFree(callback: js.Function1[/* percentage */ Double, _]): Unit = js.native
  def cpuUsage(callback: js.Function1[/* percentage */ Double, _]): Unit = js.native
  def freeCommand(callback: js.Function1[/* used_mem */ Double, _]): Unit = js.native
  def freemem(): Double = js.native
  def freememPercentage(): Double = js.native
  def getProcesses(callback: js.Function1[/* result */ String, _]): Unit = js.native
  def getProcesses(nProcess: Double, callback: js.Function1[/* result */ String, _]): Unit = js.native
  def harddrive(callback: js.Function3[/* total */ Double, /* free */ Double, /* used */ Double, _]): Unit = js.native
  def loadavg(): Double = js.native
  def loadavg(_time: Double): Double = js.native
  def platform(): Platform = js.native
  def processUptime(): Double = js.native
  def sysUptime(): Double = js.native
  def totalmem(): Double = js.native
}

