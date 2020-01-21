package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.query")
@js.native
object query extends js.Object {
  def apply(
    queryInfo: typings.chrome.chrome.tabs.QueryInfo,
    callback: js.Function1[/* result */ js.Array[typings.chrome.chrome.tabs.Tab], Unit]
  ): Unit = js.native
}

