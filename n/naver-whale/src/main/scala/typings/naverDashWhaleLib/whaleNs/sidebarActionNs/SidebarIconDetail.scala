package typings
package naverDashWhaleLib.whaleNs.sidebarActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarIconDetail extends js.Object {
  /**
    * 아이콘 이미지 데이터입니다. @see https://developer.chrome.com/extensions/pageAction#type-ImageDataType
    * */
  var icon: stdLib.ImageData
}

object SidebarIconDetail {
  @scala.inline
  def apply(icon: stdLib.ImageData): SidebarIconDetail = {
    val __obj = js.Dynamic.literal(icon = icon)
  
    __obj.asInstanceOf[SidebarIconDetail]
  }
}

