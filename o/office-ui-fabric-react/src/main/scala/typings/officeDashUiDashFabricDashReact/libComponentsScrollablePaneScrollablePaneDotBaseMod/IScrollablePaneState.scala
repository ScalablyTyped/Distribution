package typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotBaseMod

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
    val __obj = js.Dynamic.literal(scrollbarHeight = scrollbarHeight, scrollbarWidth = scrollbarWidth, stickyBottomHeight = stickyBottomHeight, stickyTopHeight = stickyTopHeight)
  
    __obj.asInstanceOf[IScrollablePaneState]
  }
}

