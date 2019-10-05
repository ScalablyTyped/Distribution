package typings.naverDashWhale.whale.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.management.get")
@js.native
object get extends js.Object {
  def apply(id: String): Unit = js.native
  def apply(
    id: String,
    callback: js.Function1[/* result */ typings.chrome.chrome.management.ExtensionInfo, Unit]
  ): Unit = js.native
}

