package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomChangeInfo extends js.Object {
  var newZoomFactor: Double
  var oldZoomFactor: Double
  var tabId: Double
  var zoomSettings: typings.chrome.chrome.tabs.ZoomSettings
}

object ZoomChangeInfo {
  @scala.inline
  def apply(
    newZoomFactor: Double,
    oldZoomFactor: Double,
    tabId: Double,
    zoomSettings: typings.chrome.chrome.tabs.ZoomSettings
  ): ZoomChangeInfo = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor.asInstanceOf[js.Any], oldZoomFactor = oldZoomFactor.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], zoomSettings = zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomChangeInfo]
  }
}

