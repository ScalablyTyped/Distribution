package typings.nodeWindows.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-windows", "kill")
@js.native
object kill extends js.Object {
  
  def apply(pid: Double): Unit = js.native
  def apply(pid: Double, force: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def apply(pid: Double, force: Boolean): Unit = js.native
  def apply(pid: Double, force: Boolean, callback: js.Function0[Unit]): Unit = js.native
}
