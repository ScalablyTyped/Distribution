package typings.navigationReact

import typings.navigation.mod.StateNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStateNavigator extends js.Object {
  var stateNavigator: StateNavigator
}

object AnonStateNavigator {
  @scala.inline
  def apply(stateNavigator: StateNavigator): AnonStateNavigator = {
    val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStateNavigator]
  }
}

