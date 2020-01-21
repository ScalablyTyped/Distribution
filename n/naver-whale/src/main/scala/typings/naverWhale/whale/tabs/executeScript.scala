package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.executeScript")
@js.native
object executeScript extends js.Object {
  def apply(details: typings.chrome.chrome.tabs.InjectDetails): Unit = js.native
  def apply(
    details: typings.chrome.chrome.tabs.InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], Unit]
  ): Unit = js.native
  def apply(tabId: Double, details: typings.chrome.chrome.tabs.InjectDetails): Unit = js.native
  def apply(
    tabId: Double,
    details: typings.chrome.chrome.tabs.InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], Unit]
  ): Unit = js.native
}

