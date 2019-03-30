package typings
package naverDashWhaleLib.whaleNs.pageActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleDetails extends js.Object {
  /** The id of the tab for which you want to modify the page action. */
  var tabId: scala.Double
  /** The tooltip string. */
  var title: java.lang.String
}

object TitleDetails {
  @scala.inline
  def apply(tabId: scala.Double, title: java.lang.String): TitleDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId, title = title)
  
    __obj.asInstanceOf[TitleDetails]
  }
}

