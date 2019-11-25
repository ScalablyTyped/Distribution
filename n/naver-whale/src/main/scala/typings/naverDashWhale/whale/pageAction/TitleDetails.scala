package typings.naverDashWhale.whale.pageAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleDetails extends js.Object {
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double
  /** The tooltip string. */
  var title: String
}

object TitleDetails {
  @scala.inline
  def apply(tabId: Double, title: String): TitleDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TitleDetails]
  }
}

