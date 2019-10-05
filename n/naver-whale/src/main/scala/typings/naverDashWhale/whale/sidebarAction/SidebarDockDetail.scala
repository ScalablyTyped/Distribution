package typings.naverDashWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarDockDetail extends js.Object {
  /** 부모 윈도우의 ID. 지정하지 않으면 마지막 사용된 윈도우에 도킹합니다. */
  var targetWindowId: js.UndefOr[Double] = js.undefined
}

object SidebarDockDetail {
  @scala.inline
  def apply(targetWindowId: Int | Double = null): SidebarDockDetail = {
    val __obj = js.Dynamic.literal()
    if (targetWindowId != null) __obj.updateDynamic("targetWindowId")(targetWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarDockDetail]
  }
}

