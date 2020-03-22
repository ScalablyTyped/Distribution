package typings.minappEnv.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabItemTapOption extends js.Object {
  /** 被点击tabItem的序号，从0开始，最低基础库： `1.9.0` */
  var index: String
  /** 被点击tabItem的页面路径，最低基础库： `1.9.0` */
  var pagePath: String
  /** 被点击tabItem的按钮文字，最低基础库： `1.9.0` */
  var text: String
}

object ITabItemTapOption {
  @scala.inline
  def apply(index: String, pagePath: String, text: String): ITabItemTapOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITabItemTapOption]
  }
}

