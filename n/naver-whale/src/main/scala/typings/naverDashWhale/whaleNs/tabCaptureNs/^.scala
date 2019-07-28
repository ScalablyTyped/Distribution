package typings.naverDashWhale.whaleNs.tabCaptureNs

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabCapture")
@js.native
object ^ extends js.Object {
  var onStatusChanged: typings.chrome.chromeNs.tabCaptureNs.CaptureStatusChangedEvent = js.native
  def capture(
    options: typings.chrome.chromeNs.tabCaptureNs.CaptureOptions,
    callback: js.Function1[/* stream */ MediaStream | Null, Unit]
  ): Unit = js.native
  def getCapturedTabs(
    callback: js.Function1[/* result */ js.Array[typings.chrome.chromeNs.tabCaptureNs.CaptureInfo], Unit]
  ): Unit = js.native
}

