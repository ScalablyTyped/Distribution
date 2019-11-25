package typings.naverDashWhale

import typings.chrome.chrome.tabCapture.CaptureInfo
import typings.chrome.chrome.tabCapture.CaptureOptions
import typings.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoftabCapture extends js.Object {
  var onStatusChanged: CaptureStatusChangedEvent
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit
}

object TypeoftabCapture {
  @scala.inline
  def apply(
    capture: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Unit,
    getCapturedTabs: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Unit,
    onStatusChanged: CaptureStatusChangedEvent
  ): TypeoftabCapture = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), getCapturedTabs = js.Any.fromFunction1(getCapturedTabs), onStatusChanged = onStatusChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeoftabCapture]
  }
}

