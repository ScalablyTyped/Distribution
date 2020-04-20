package typings.minappEnv.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageScrollOption extends js.Object {
  /** 页面在垂直方向已滚动的距离（单位px） */
  var scrollTop: Double
}

object IPageScrollOption {
  @scala.inline
  def apply(scrollTop: Double): IPageScrollOption = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageScrollOption]
  }
}

