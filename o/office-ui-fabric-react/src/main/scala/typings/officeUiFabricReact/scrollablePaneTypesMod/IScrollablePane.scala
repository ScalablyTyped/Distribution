package typings.officeUiFabricReact.scrollablePaneTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePane extends js.Object {
  /** Triggers a layout update for the pane. */
  def forceLayoutUpdate(): Unit
  /** Gets the current scroll position of the scrollable pane */
  def getScrollPosition(): Double
}

object IScrollablePane {
  @scala.inline
  def apply(forceLayoutUpdate: () => Unit, getScrollPosition: () => Double): IScrollablePane = {
    val __obj = js.Dynamic.literal(forceLayoutUpdate = js.Any.fromFunction0(forceLayoutUpdate), getScrollPosition = js.Any.fromFunction0(getScrollPosition))
  
    __obj.asInstanceOf[IScrollablePane]
  }
}

