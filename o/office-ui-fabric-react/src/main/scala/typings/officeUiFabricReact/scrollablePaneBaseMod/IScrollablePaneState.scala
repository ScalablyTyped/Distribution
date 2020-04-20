package typings.officeUiFabricReact.scrollablePaneBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePaneState extends js.Object {
  var scrollbarHeight: Double
  var scrollbarWidth: Double
  var stickyBottomHeight: Double
  var stickyTopHeight: Double
}

object IScrollablePaneState {
  @scala.inline
  def apply(
    scrollbarHeight: Double,
    scrollbarWidth: Double,
    stickyBottomHeight: Double,
    stickyTopHeight: Double
  ): IScrollablePaneState = {
    val __obj = js.Dynamic.literal(scrollbarHeight = scrollbarHeight.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], stickyBottomHeight = stickyBottomHeight.asInstanceOf[js.Any], stickyTopHeight = stickyTopHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneState]
  }
}

