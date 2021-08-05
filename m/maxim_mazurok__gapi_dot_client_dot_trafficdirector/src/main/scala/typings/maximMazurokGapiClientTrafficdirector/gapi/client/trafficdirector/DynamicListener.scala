package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicListener extends StObject {
  
  /** The listener state for any active listener by this name. These are listeners that are available to service data plane traffic. */
  var activeState: js.UndefOr[DynamicListenerState] = js.undefined
  
  /**
    * The listener state for any draining listener by this name. These are listeners that are currently undergoing draining in preparation to stop servicing data plane traffic. Note that
    * if attempting to recreate an Envoy configuration from a configuration dump, the draining listeners should generally be discarded.
    */
  var drainingState: js.UndefOr[DynamicListenerState] = js.undefined
  
  /** Set if the last update failed, cleared after the next successful update. */
  var errorState: js.UndefOr[UpdateFailureState] = js.undefined
  
  /** The name or unique id of this listener, pulled from the DynamicListenerState config. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The listener state for any warming listener by this name. These are listeners that are currently undergoing warming in preparation to service data plane traffic. Note that if
    * attempting to recreate an Envoy configuration from a configuration dump, the warming listeners should generally be discarded.
    */
  var warmingState: js.UndefOr[DynamicListenerState] = js.undefined
}
object DynamicListener {
  
  inline def apply(): DynamicListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicListener]
  }
  
  extension [Self <: DynamicListener](x: Self) {
    
    inline def setActiveState(value: DynamicListenerState): Self = StObject.set(x, "activeState", value.asInstanceOf[js.Any])
    
    inline def setActiveStateUndefined: Self = StObject.set(x, "activeState", js.undefined)
    
    inline def setDrainingState(value: DynamicListenerState): Self = StObject.set(x, "drainingState", value.asInstanceOf[js.Any])
    
    inline def setDrainingStateUndefined: Self = StObject.set(x, "drainingState", js.undefined)
    
    inline def setErrorState(value: UpdateFailureState): Self = StObject.set(x, "errorState", value.asInstanceOf[js.Any])
    
    inline def setErrorStateUndefined: Self = StObject.set(x, "errorState", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWarmingState(value: DynamicListenerState): Self = StObject.set(x, "warmingState", value.asInstanceOf[js.Any])
    
    inline def setWarmingStateUndefined: Self = StObject.set(x, "warmingState", js.undefined)
  }
}
