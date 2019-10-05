package typings.naverDashWhale.whale.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.windows.getAll")
@js.native
object getAll extends js.Object {
  def apply(callback: js.Function1[/* windows */ js.Array[typings.chrome.chrome.windows.Window], Unit]): Unit = js.native
  def apply(
    getInfo: typings.chrome.chrome.windows.GetInfo,
    callback: js.Function1[/* windows */ js.Array[typings.chrome.chrome.windows.Window], Unit]
  ): Unit = js.native
}

