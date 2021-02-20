package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetConfig extends StObject {
  
  /** Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`. */
  var fleetSpec: js.UndefOr[String] = js.native
  
  /** The name of the FleetConfig. */
  var name: js.UndefOr[String] = js.native
}
object FleetConfig {
  
  @scala.inline
  def apply(): FleetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetConfig]
  }
  
  @scala.inline
  implicit class FleetConfigMutableBuilder[Self <: FleetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetSpec(value: String): Self = StObject.set(x, "fleetSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetSpecUndefined: Self = StObject.set(x, "fleetSpec", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
