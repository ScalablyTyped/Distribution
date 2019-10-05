package typings.naverDashWhale.whale.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.management.uninstall")
@js.native
object uninstall extends js.Object {
  def apply(id: String): Unit = js.native
  def apply(id: String, callback: js.Function0[Unit]): Unit = js.native
  def apply(id: String, options: typings.chrome.chrome.management.UninstallOptions): Unit = js.native
  def apply(
    id: String,
    options: typings.chrome.chrome.management.UninstallOptions,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

