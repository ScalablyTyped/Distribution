package typings.naverDashWhale.whale.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.history.search")
@js.native
object search extends js.Object {
  def apply(
    query: typings.chrome.chrome.history.HistoryQuery,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chrome.history.HistoryItem], Unit]
  ): Unit = js.native
}

