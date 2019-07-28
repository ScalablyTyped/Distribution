package typings.naverDashWhale.whaleNs.sidebarActionNs

import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarIconDetail extends js.Object {
  /**
    * 아이콘 이미지 데이터입니다. @see https://developer.chrome.com/extensions/pageAction#type-ImageDataType
    * */
  var icon: ImageData
}

object SidebarIconDetail {
  @scala.inline
  def apply(icon: ImageData): SidebarIconDetail = {
    val __obj = js.Dynamic.literal(icon = icon)
  
    __obj.asInstanceOf[SidebarIconDetail]
  }
}

