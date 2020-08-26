package typings.naverWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarDockDetail extends js.Object {
  /** 부모 윈도우의 ID. 지정하지 않으면 마지막 사용된 윈도우에 도킹합니다. */
  var targetWindowId: js.UndefOr[Double] = js.native
}

object SidebarDockDetail {
  @scala.inline
  def apply(): SidebarDockDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidebarDockDetail]
  }
  @scala.inline
  implicit class SidebarDockDetailOps[Self <: SidebarDockDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetWindowId(value: Double): Self = this.set("targetWindowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetWindowId: Self = this.set("targetWindowId", js.undefined)
  }
  
}

