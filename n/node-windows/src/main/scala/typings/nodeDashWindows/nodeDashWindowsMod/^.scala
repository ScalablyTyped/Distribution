package typings.nodeDashWindows.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-windows", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def elevate(cmd: String, options: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def isAdminUser(callback: js.Function1[/* isAdmin */ Boolean, Unit]): Unit = js.native
  def kill(pid: Double): Unit = js.native
  def kill(pid: Double, force: Boolean): Unit = js.native
  def kill(pid: Double, force: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def list(callback: js.Function1[/* proc */ js.Any, Unit]): Unit = js.native
  def list(callback: js.Function1[/* proc */ js.Any, Unit], verbose: Boolean): Unit = js.native
  def sudo(cmd: String, password: String, options: js.Any, callback: js.Function0[Unit]): Unit = js.native
}

