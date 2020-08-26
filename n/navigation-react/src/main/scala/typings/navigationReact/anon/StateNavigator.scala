package typings.navigationReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateNavigator extends js.Object {
  var stateNavigator: typings.navigation.mod.StateNavigator = js.native
}

object StateNavigator {
  @scala.inline
  def apply(stateNavigator: typings.navigation.mod.StateNavigator): StateNavigator = {
    val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNavigator]
  }
  @scala.inline
  implicit class StateNavigatorOps[Self <: StateNavigator] (val x: Self) extends AnyVal {
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
    def setStateNavigator(value: typings.navigation.mod.StateNavigator): Self = this.set("stateNavigator", value.asInstanceOf[js.Any])
  }
  
}

