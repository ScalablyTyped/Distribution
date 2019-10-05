package typings.naverDashWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationReplacementCallbackDetails
  extends typings.chrome.chrome.webNavigation.WebNavigationCallbackDetails {
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double
}

object WebNavigationReplacementCallbackDetails {
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): WebNavigationReplacementCallbackDetails = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId, tabId = tabId, timeStamp = timeStamp)
  
    __obj.asInstanceOf[WebNavigationReplacementCallbackDetails]
  }
}

