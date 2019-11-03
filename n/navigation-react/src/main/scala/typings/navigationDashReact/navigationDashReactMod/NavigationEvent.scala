package typings.navigationDashReact.navigationDashReactMod

import typings.navigation.navigationMod.State
import typings.navigation.navigationMod.StateNavigator
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
    val __obj = js.Dynamic.literal(asyncData = asyncData, data = data, oldState = oldState, state = state, stateNavigator = stateNavigator)
  
    __obj.asInstanceOf[NavigationEvent]
  }
}

