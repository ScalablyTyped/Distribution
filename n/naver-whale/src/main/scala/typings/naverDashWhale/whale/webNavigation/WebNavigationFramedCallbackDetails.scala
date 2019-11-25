package typings.naverDashWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationFramedCallbackDetails
  extends typings.chrome.chrome.webNavigation.WebNavigationUrlCallbackDetails {
  /** 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a subframe. Frame IDs are unique for a given tab and process. */
  var frameId: Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @since Chrome 22.
    */
  var processId: Double
}

object WebNavigationFramedCallbackDetails {
  @scala.inline
  def apply(frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedCallbackDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebNavigationFramedCallbackDetails]
  }
}

