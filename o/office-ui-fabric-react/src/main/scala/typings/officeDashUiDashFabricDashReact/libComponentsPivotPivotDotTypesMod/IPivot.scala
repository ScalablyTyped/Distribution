package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPivot extends js.Object {
  /**
    * Sets focus to the first pivot tab.
    */
  def focus(): Unit
}

object IPivot {
  @scala.inline
  def apply(focus: () => Unit): IPivot = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[IPivot]
  }
}

