package typings.node.osMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingString
import typings.node.Buffer
import typings.node.NodeJSNs.Platform
import typings.node.nodeStrings.BE
import typings.node.nodeStrings.LE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EOL: java.lang.String = js.native
  def arch(): java.lang.String = js.native
  def cpus(): js.Array[CpuInfo] = js.native
  def endianness(): BE | LE = js.native
  def freemem(): Double = js.native
  /**
    * Gets the priority of a process.
    * Defaults to current process.
    */
  def getPriority(): Double = js.native
  def getPriority(pid: Double): Double = js.native
  def homedir(): java.lang.String = js.native
  def hostname(): java.lang.String = js.native
  def loadavg(): js.Array[Double] = js.native
  def networkInterfaces(): StringDictionary[js.Array[NetworkInterfaceInfo]] = js.native
  def platform(): Platform = js.native
  def release(): java.lang.String = js.native
  /**
    * Sets the priority of the process specified process.
    * @param priority Must be in range of -20 to 19
    */
  def setPriority(pid: Double, priority: Double): Unit = js.native
  /**
    * Sets the priority of the current process.
    * @param priority Must be in range of -20 to 19
    */
  def setPriority(priority: Double): Unit = js.native
  def tmpdir(): java.lang.String = js.native
  def totalmem(): Double = js.native
  def `type`(): java.lang.String = js.native
  def uptime(): Double = js.native
  def userInfo(): UserInfo[java.lang.String] = js.native
  def userInfo(options: Anon_BufferEncoding): UserInfo[Buffer] = js.native
  def userInfo(options: Anon_EncodingString): UserInfo[java.lang.String] = js.native
}

