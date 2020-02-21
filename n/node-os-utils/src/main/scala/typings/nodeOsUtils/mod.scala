package typings.nodeOsUtils

import typings.nodeOsUtils.cpuMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val cpu: default = js.native
  val drive: typings.nodeOsUtils.driveMod.default = js.native
  val mem: typings.nodeOsUtils.memMod.default = js.native
  val netstat: typings.nodeOsUtils.netstatMod.default = js.native
  val openfiles: typings.nodeOsUtils.openfilesMod.default = js.native
  val os: typings.nodeOsUtils.osMod.default = js.native
  val oscmd: typings.nodeOsUtils.oscmdMod.default = js.native
  val proc: typings.nodeOsUtils.procMod.default = js.native
  val users: typings.nodeOsUtils.usersMod.default = js.native
  def exec(command: String): js.Function0[js.Promise[String]] = js.native
  def isNotSupported(res: js.Any): Boolean = js.native
  def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = js.native
  @js.native
  object options extends js.Object {
    var INTERVAL: Double = js.native
    var NOT_SUPPORTED_VALUE: String = js.native
  }
  
}

