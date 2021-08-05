package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingConfig extends StObject {
  
  /** Required. Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/ */
  var fleetAutoscalerSpec: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the Scaling Config */
  var name: js.UndefOr[String] = js.undefined
  
  /** The schedules to which this Scaling Config applies. */
  var schedules: js.UndefOr[js.Array[Schedule]] = js.undefined
  
  /**
    * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any
    * of the selector entries.
    */
  var selectors: js.UndefOr[js.Array[LabelSelector]] = js.undefined
}
object ScalingConfig {
  
  inline def apply(): ScalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingConfig]
  }
  
  extension [Self <: ScalingConfig](x: Self) {
    
    inline def setFleetAutoscalerSpec(value: String): Self = StObject.set(x, "fleetAutoscalerSpec", value.asInstanceOf[js.Any])
    
    inline def setFleetAutoscalerSpecUndefined: Self = StObject.set(x, "fleetAutoscalerSpec", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchedules(value: js.Array[Schedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesUndefined: Self = StObject.set(x, "schedules", js.undefined)
    
    inline def setSchedulesVarargs(value: Schedule*): Self = StObject.set(x, "schedules", js.Array(value :_*))
    
    inline def setSelectors(value: js.Array[LabelSelector]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setSelectorsVarargs(value: LabelSelector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
  }
}
