package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicListener extends js.Object {
  
  /** The listener state for any active listener by this name. These are listeners that are available to service data plane traffic. */
  var activeState: js.UndefOr[DynamicListenerState] = js.native
  
  /**
    * The listener state for any draining listener by this name. These are listeners that are currently undergoing draining in preparation to stop servicing data plane traffic. Note that
    * if attempting to recreate an Envoy configuration from a configuration dump, the draining listeners should generally be discarded.
    */
  var drainingState: js.UndefOr[DynamicListenerState] = js.native
  
  /** Set if the last update failed, cleared after the next successful update. */
  var errorState: js.UndefOr[UpdateFailureState] = js.native
  
  /** The name or unique id of this listener, pulled from the DynamicListenerState config. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The listener state for any warming listener by this name. These are listeners that are currently undergoing warming in preparation to service data plane traffic. Note that if
    * attempting to recreate an Envoy configuration from a configuration dump, the warming listeners should generally be discarded.
    */
  var warmingState: js.UndefOr[DynamicListenerState] = js.native
}
object DynamicListener {
  
  @scala.inline
  def apply(): DynamicListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicListener]
  }
  
  @scala.inline
  implicit class DynamicListenerOps[Self <: DynamicListener] (val x: Self) extends AnyVal {
    
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
    def setActiveState(value: DynamicListenerState): Self = this.set("activeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveState: Self = this.set("activeState", js.undefined)
    
    @scala.inline
    def setDrainingState(value: DynamicListenerState): Self = this.set("drainingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrainingState: Self = this.set("drainingState", js.undefined)
    
    @scala.inline
    def setErrorState(value: UpdateFailureState): Self = this.set("errorState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorState: Self = this.set("errorState", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setWarmingState(value: DynamicListenerState): Self = this.set("warmingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarmingState: Self = this.set("warmingState", js.undefined)
  }
}
