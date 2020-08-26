package typings.naverWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarPageDetail extends js.Object {
  /** html 파일의 리소스 경로. 빈 문자열(‘’)로 설정하면 사이드바에 빈화면이 보입니다. */
  var page: String = js.native
}

object SidebarPageDetail {
  @scala.inline
  def apply(page: String): SidebarPageDetail = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarPageDetail]
  }
  @scala.inline
  implicit class SidebarPageDetailOps[Self <: SidebarPageDetail] (val x: Self) extends AnyVal {
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
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}

