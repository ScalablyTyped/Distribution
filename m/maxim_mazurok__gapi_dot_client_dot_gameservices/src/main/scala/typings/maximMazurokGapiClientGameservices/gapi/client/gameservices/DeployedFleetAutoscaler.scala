package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployedFleetAutoscaler extends StObject {
  
  /** The name of the Agones autoscaler. */
  var autoscaler: js.UndefOr[String] = js.undefined
  
  /** The autoscaler spec retrieved from Agones. */
  var fleetAutoscalerSpec: js.UndefOr[String] = js.undefined
  
  /** The source spec that is used to create the autoscaler. The GameServerConfig resource may no longer exist in the system. */
  var specSource: js.UndefOr[SpecSource] = js.undefined
}
object DeployedFleetAutoscaler {
  
  @scala.inline
  def apply(): DeployedFleetAutoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedFleetAutoscaler]
  }
  
  @scala.inline
  implicit class DeployedFleetAutoscalerMutableBuilder[Self <: DeployedFleetAutoscaler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscaler(value: String): Self = StObject.set(x, "autoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalerUndefined: Self = StObject.set(x, "autoscaler", js.undefined)
    
    @scala.inline
    def setFleetAutoscalerSpec(value: String): Self = StObject.set(x, "fleetAutoscalerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetAutoscalerSpecUndefined: Self = StObject.set(x, "fleetAutoscalerSpec", js.undefined)
    
    @scala.inline
    def setSpecSource(value: SpecSource): Self = StObject.set(x, "specSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecSourceUndefined: Self = StObject.set(x, "specSource", js.undefined)
  }
}
