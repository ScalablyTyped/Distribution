package typings.naverDashWhale.whaleNs.sidebarActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarPageDetail extends js.Object {
  /** html 파일의 리소스 경로. 빈 문자열(‘’)로 설정하면 사이드바에 빈화면이 보입니다. */
  var page: String
}

object SidebarPageDetail {
  @scala.inline
  def apply(page: String): SidebarPageDetail = {
    val __obj = js.Dynamic.literal(page = page)
  
    __obj.asInstanceOf[SidebarPageDetail]
  }
}

