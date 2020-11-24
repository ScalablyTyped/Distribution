package typings.navigationReact.mod

import typings.navigation.mod.State
import typings.navigation.mod.StateNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationEvent extends js.Object {
  
  /**
    * The current asynchronous data
    */
  var asyncData: js.Any = js.native
  
  /**
    * The NavigationData for the current State
    */
  var data: js.Any = js.native
  
  /**
    * The last State displayed before the current State
    */
  var oldState: State = js.native
  
  /**
    * The current State
    */
  var state: State = js.native
  
  /**
    * State navigator for the current context
    */
  var stateNavigator: StateNavigator = js.native
}
object NavigationEvent {
  
  @scala.inline
  def apply(asyncData: js.Any, data: js.Any, oldState: State, state: State, stateNavigator: StateNavigator): NavigationEvent = {
    val __obj = js.Dynamic.literal(asyncData = asyncData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateNavigator = stateNavigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEvent]
  }
  
  @scala.inline
  implicit class NavigationEventOps[Self <: NavigationEvent] (val x: Self) extends AnyVal {
    
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
    def setAsyncData(value: js.Any): Self = this.set("asyncData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: State): Self = this.set("oldState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNavigator(value: StateNavigator): Self = this.set("stateNavigator", value.asInstanceOf[js.Any])
  }
}
