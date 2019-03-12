package typings
package nodeLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EOL: java.lang.String = js.native
  val constants: nodeLib.Anon_Errno = js.native
  def arch(): java.lang.String = js.native
  def cpus(): js.Array[CpuInfo] = js.native
  def endianness(): nodeLib.nodeLibStrings.BE | nodeLib.nodeLibStrings.LE = js.native
  def freemem(): scala.Double = js.native
  /**
    * Gets the priority of a process.
    * Defaults to current process.
    */
  def getPriority(): scala.Double = js.native
  def getPriority(pid: scala.Double): scala.Double = js.native
  def homedir(): java.lang.String = js.native
  def hostname(): java.lang.String = js.native
  def loadavg(): js.Array[scala.Double] = js.native
  def networkInterfaces(): org.scalablytyped.runtime.StringDictionary[js.Array[NetworkInterfaceInfo]] = js.native
  def platform(): nodeLib.NodeJSNs.Platform = js.native
  def release(): java.lang.String = js.native
  /**
    * Sets the priority of the process specified process.
    * @param priority Must be in range of -20 to 19
    */
  def setPriority(pid: scala.Double, priority: scala.Double): scala.Unit = js.native
  /**
    * Sets the priority of the current process.
    * @param priority Must be in range of -20 to 19
    */
  def setPriority(priority: scala.Double): scala.Unit = js.native
  def tmpdir(): java.lang.String = js.native
  def totalmem(): scala.Double = js.native
  def `type`(): java.lang.String = js.native
  def uptime(): scala.Double = js.native
  def userInfo(): UserInfo[java.lang.String] = js.native
  def userInfo(options: nodeLib.Anon_BufferEncoding): UserInfo[nodeLib.Buffer] = js.native
  def userInfo(options: nodeLib.Anon_EncodingString): UserInfo[java.lang.String] = js.native
}

