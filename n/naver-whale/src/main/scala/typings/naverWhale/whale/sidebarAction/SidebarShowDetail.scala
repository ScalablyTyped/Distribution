package typings.naverWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarShowDetail extends js.Object {
  /**
    * Optional. url 인자와 현재 URL이 같을 때에도 페이지를 새로고침 할 것인지 여부.
    * @default false
    */
  var reload: js.UndefOr[Boolean] = js.native
  /** Optional. 사이드바 영역에 표시할 페이지 URL. 지정하지 않으면 매니페스트에 정의한 default_page. */
  var url: js.UndefOr[String] = js.native
}

object SidebarShowDetail {
  @scala.inline
  def apply(): SidebarShowDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidebarShowDetail]
  }
  @scala.inline
  implicit class SidebarShowDetailOps[Self <: SidebarShowDetail] (val x: Self) extends AnyVal {
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
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

