package typings.navigationReact.mod

import typings.navigation.mod.State
import typings.navigation.mod.StateNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEvent extends js.Object {
  /**
    * The current asynchronous data
    */
  var asyncData: js.Any
  /**
    * The NavigationData for the current State
    */
  var data: js.Any
  /**
    * The last State displayed before the current State
    */
  var oldState: State
  /**
    * The current State
    */
  var state: State
  /**
    * State navigator for the current context
    */
  var stateNavigator: StateNavigator
}

object NavigationEvent {
  @scala.inline
  def apply(asyncData: js.Any, data: js.Any, oldState: State, state: State, stateNavigator: StateNavigator): NavigationEvent = {
    val __obj = js.Dynamic.literal(asyncData = asyncData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateNavigator = stateNavigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEvent]
  }
}

