package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetFleetDetails extends StObject {
  
  /** Reference to target Agones fleet autoscaling policy. */
  var autoscaler: js.UndefOr[TargetFleetAutoscaler] = js.undefined
  
  /** Reference to target Agones fleet. */
  var fleet: js.UndefOr[TargetFleet] = js.undefined
}
object TargetFleetDetails {
  
  inline def apply(): TargetFleetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetFleetDetails]
  }
  
  extension [Self <: TargetFleetDetails](x: Self) {
    
    inline def setAutoscaler(value: TargetFleetAutoscaler): Self = StObject.set(x, "autoscaler", value.asInstanceOf[js.Any])
    
    inline def setAutoscalerUndefined: Self = StObject.set(x, "autoscaler", js.undefined)
    
    inline def setFleet(value: TargetFleet): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
  }
}
