package typings.naverDashWhale.whaleNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.history")
@js.native
object ^ extends js.Object {
  var onVisitRemoved: typings.chrome.chromeNs.historyNs.HistoryVisitRemovedEvent = js.native
  var onVisited: typings.chrome.chromeNs.historyNs.HistoryVisitedEvent = js.native
  def addUrl(details: typings.chrome.chromeNs.historyNs.Url): Unit = js.native
  def addUrl(details: typings.chrome.chromeNs.historyNs.Url, callback: js.Function0[Unit]): Unit = js.native
  def deleteAll(callback: js.Function0[Unit]): Unit = js.native
  def deleteRange(range: typings.chrome.chromeNs.historyNs.Range, callback: js.Function0[Unit]): Unit = js.native
  def deleteUrl(details: typings.chrome.chromeNs.historyNs.Url): Unit = js.native
  def deleteUrl(details: typings.chrome.chromeNs.historyNs.Url, callback: js.Function0[Unit]): Unit = js.native
  def getVisits(
    details: typings.chrome.chromeNs.historyNs.Url,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.historyNs.VisitItem], Unit]
  ): Unit = js.native
  def search(
    query: typings.chrome.chromeNs.historyNs.HistoryQuery,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.historyNs.HistoryItem], Unit]
  ): Unit = js.native
}

