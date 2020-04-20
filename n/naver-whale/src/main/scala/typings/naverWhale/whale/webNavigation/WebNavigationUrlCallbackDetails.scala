package typings.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationUrlCallbackDetails
  extends typings.chrome.chrome.webNavigation.WebNavigationCallbackDetails {
  var url: String
}

object WebNavigationUrlCallbackDetails {
  @scala.inline
  def apply(tabId: Double, timeStamp: Double, url: String): WebNavigationUrlCallbackDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationUrlCallbackDetails]
  }
}

