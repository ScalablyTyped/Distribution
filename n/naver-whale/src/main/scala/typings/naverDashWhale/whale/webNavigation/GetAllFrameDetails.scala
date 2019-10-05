package typings.naverDashWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAllFrameDetails extends js.Object {
  /** The ID of the tab. */
  var tabId: Double
}

object GetAllFrameDetails {
  @scala.inline
  def apply(tabId: Double): GetAllFrameDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId)
  
    __obj.asInstanceOf[GetAllFrameDetails]
  }
}

