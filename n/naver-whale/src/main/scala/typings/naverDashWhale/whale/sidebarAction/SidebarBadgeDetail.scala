package typings.naverDashWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarBadgeDetail extends js.Object {
  /** 설정할 badge 문자열 */
  var text: String
}

object SidebarBadgeDetail {
  @scala.inline
  def apply(text: String): SidebarBadgeDetail = {
    val __obj = js.Dynamic.literal(text = text)
  
    __obj.asInstanceOf[SidebarBadgeDetail]
  }
}

