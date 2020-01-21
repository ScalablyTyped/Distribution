package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.create")
@js.native
object create extends js.Object {
  def apply(createProperties: typings.chrome.chrome.tabs.CreateProperties): Unit = js.native
  def apply(
    createProperties: typings.chrome.chrome.tabs.CreateProperties,
    callback: js.Function1[/* tab */ typings.chrome.chrome.tabs.Tab, Unit]
  ): Unit = js.native
}

