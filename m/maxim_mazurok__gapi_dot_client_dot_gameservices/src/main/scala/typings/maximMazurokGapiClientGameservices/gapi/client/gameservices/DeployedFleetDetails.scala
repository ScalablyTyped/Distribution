package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployedFleetDetails extends StObject {
  
  /** Information about the Agones autoscaler for that fleet. */
  var deployedAutoscaler: js.UndefOr[DeployedFleetAutoscaler] = js.undefined
  
  /** Information about the Agones fleet. */
  var deployedFleet: js.UndefOr[DeployedFleet] = js.undefined
}
object DeployedFleetDetails {
  
  inline def apply(): DeployedFleetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedFleetDetails]
  }
  
  extension [Self <: DeployedFleetDetails](x: Self) {
    
    inline def setDeployedAutoscaler(value: DeployedFleetAutoscaler): Self = StObject.set(x, "deployedAutoscaler", value.asInstanceOf[js.Any])
    
    inline def setDeployedAutoscalerUndefined: Self = StObject.set(x, "deployedAutoscaler", js.undefined)
    
    inline def setDeployedFleet(value: DeployedFleet): Self = StObject.set(x, "deployedFleet", value.asInstanceOf[js.Any])
    
    inline def setDeployedFleetUndefined: Self = StObject.set(x, "deployedFleet", js.undefined)
  }
}
