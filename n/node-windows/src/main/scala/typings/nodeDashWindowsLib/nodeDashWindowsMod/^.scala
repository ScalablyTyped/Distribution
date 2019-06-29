package typings
package nodeDashWindowsLib.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-windows", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def elevate(cmd: java.lang.String, options: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def isAdminUser(callback: js.Function1[/* isAdmin */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def kill(pid: scala.Double): scala.Unit = js.native
  def kill(pid: scala.Double, force: scala.Boolean): scala.Unit = js.native
  def kill(pid: scala.Double, force: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def list(callback: js.Function1[/* proc */ js.Any, scala.Unit]): scala.Unit = js.native
  def list(callback: js.Function1[/* proc */ js.Any, scala.Unit], verbose: scala.Boolean): scala.Unit = js.native
  def sudo(
    cmd: java.lang.String,
    password: java.lang.String,
    options: js.Any,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

