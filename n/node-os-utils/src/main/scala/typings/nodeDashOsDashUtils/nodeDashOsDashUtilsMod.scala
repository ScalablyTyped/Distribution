package typings.nodeDashOsDashUtils

import typings.nodeDashOsDashUtils.libCpuMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils", JSImport.Namespace)
@js.native
object nodeDashOsDashUtilsMod extends js.Object {
  val cpu: default = js.native
  val drive: typings.nodeDashOsDashUtils.libDriveMod.default = js.native
  val mem: typings.nodeDashOsDashUtils.libMemMod.default = js.native
  val netstat: typings.nodeDashOsDashUtils.libNetstatMod.default = js.native
  val openfiles: typings.nodeDashOsDashUtils.libOpenfilesMod.default = js.native
  val os: typings.nodeDashOsDashUtils.libOsMod.default = js.native
  val oscmd: typings.nodeDashOsDashUtils.libOscmdMod.default = js.native
  val proc: typings.nodeDashOsDashUtils.libProcMod.default = js.native
  val users: typings.nodeDashOsDashUtils.libUsersMod.default = js.native
  def exec(command: String): js.Function0[js.Promise[String]] = js.native
  @js.native
  object options extends js.Object {
    var INTERVAL: Double = js.native
    var NOT_SUPPORTED_VALUE: String = js.native
  }
  
}

