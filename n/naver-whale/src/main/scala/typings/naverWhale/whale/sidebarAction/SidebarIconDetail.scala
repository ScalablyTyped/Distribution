package typings.naverWhale.whale.sidebarAction

import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarIconDetail extends js.Object {
  /**
    * 아이콘 이미지 데이터입니다. @see https://developer.chrome.com/extensions/pageAction#type-ImageDataType
    * */
  var icon: ImageData = js.native
}

object SidebarIconDetail {
  @scala.inline
  def apply(icon: ImageData): SidebarIconDetail = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarIconDetail]
  }
  @scala.inline
  implicit class SidebarIconDetailOps[Self <: SidebarIconDetail] (val x: Self) extends AnyVal {
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
    def setIcon(value: ImageData): Self = this.set("icon", value.asInstanceOf[js.Any])
  }
  
}

