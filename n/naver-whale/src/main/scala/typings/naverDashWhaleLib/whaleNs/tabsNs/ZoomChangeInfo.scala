package typings
package naverDashWhaleLib.whaleNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomChangeInfo extends js.Object {
  var newZoomFactor: scala.Double
  var oldZoomFactor: scala.Double
  var tabId: scala.Double
  var zoomSettings: chromeLib.chromeNs.tabsNs.ZoomSettings
}

object ZoomChangeInfo {
  @scala.inline
  def apply(
    newZoomFactor: scala.Double,
    oldZoomFactor: scala.Double,
    tabId: scala.Double,
    zoomSettings: chromeLib.chromeNs.tabsNs.ZoomSettings
  ): ZoomChangeInfo = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor, oldZoomFactor = oldZoomFactor, tabId = tabId, zoomSettings = zoomSettings)
  
    __obj.asInstanceOf[ZoomChangeInfo]
  }
}

