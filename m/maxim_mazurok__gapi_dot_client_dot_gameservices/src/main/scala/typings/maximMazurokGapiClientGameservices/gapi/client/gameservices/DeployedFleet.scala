package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployedFleet extends StObject {
  
  /** The name of the Agones fleet. */
  var fleet: js.UndefOr[String] = js.undefined
  
  /** The fleet spec retrieved from the Agones fleet. */
  var fleetSpec: js.UndefOr[String] = js.undefined
  
  /** The source spec that is used to create the Agones fleet. The GameServerConfig resource may no longer exist in the system. */
  var specSource: js.UndefOr[SpecSource] = js.undefined
  
  /** The current status of the Agones fleet. Includes count of game servers in various states. */
  var status: js.UndefOr[DeployedFleetStatus] = js.undefined
}
object DeployedFleet {
  
  @scala.inline
  def apply(): DeployedFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedFleet]
  }
  
  @scala.inline
  implicit class DeployedFleetMutableBuilder[Self <: DeployedFleet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleet(value: String): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetSpec(value: String): Self = StObject.set(x, "fleetSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetSpecUndefined: Self = StObject.set(x, "fleetSpec", js.undefined)
    
    @scala.inline
    def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
    
    @scala.inline
    def setSpecSource(value: SpecSource): Self = StObject.set(x, "specSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecSourceUndefined: Self = StObject.set(x, "specSource", js.undefined)
    
    @scala.inline
    def setStatus(value: DeployedFleetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
