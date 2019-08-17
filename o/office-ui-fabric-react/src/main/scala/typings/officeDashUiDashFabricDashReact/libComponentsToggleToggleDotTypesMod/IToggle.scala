package typings.officeDashUiDashFabricDashReact.libComponentsToggleToggleDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle extends js.Object {
  def focus(): Unit
}

object IToggle {
  @scala.inline
  def apply(focus: () => Unit): IToggle = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[IToggle]
  }
}

