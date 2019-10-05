package typings.naverDashWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarShowDetail extends js.Object {
  /**
    * Optional. url 인자와 현재 URL이 같을 때에도 페이지를 새로고침 할 것인지 여부.
    * @default false
    */
  var reload: js.UndefOr[Boolean] = js.undefined
  /** Optional. 사이드바 영역에 표시할 페이지 URL. 지정하지 않으면 매니페스트에 정의한 default_page. */
  var url: js.UndefOr[String] = js.undefined
}

object SidebarShowDetail {
  @scala.inline
  def apply(reload: js.UndefOr[Boolean] = js.undefined, url: String = null): SidebarShowDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SidebarShowDetail]
  }
}

