package typings.naverWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarDockDetail extends js.Object {
  /** 부모 윈도우의 ID. 지정하지 않으면 마지막 사용된 윈도우에 도킹합니다. */
  var targetWindowId: js.UndefOr[Double] = js.undefined
}

object SidebarDockDetail {
  @scala.inline
  def apply(targetWindowId: js.UndefOr[Double] = js.undefined): SidebarDockDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(targetWindowId)) __obj.updateDynamic("targetWindowId")(targetWindowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarDockDetail]
  }
}

