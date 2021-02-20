package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonePeeringConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.native
  
  /** The network with which to peer. */
  var targetNetwork: js.UndefOr[ManagedZonePeeringConfigTargetNetwork] = js.native
}
object ManagedZonePeeringConfig {
  
  @scala.inline
  def apply(): ManagedZonePeeringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonePeeringConfig]
  }
  
  @scala.inline
  implicit class ManagedZonePeeringConfigMutableBuilder[Self <: ManagedZonePeeringConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTargetNetwork(value: ManagedZonePeeringConfigTargetNetwork): Self = StObject.set(x, "targetNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNetworkUndefined: Self = StObject.set(x, "targetNetwork", js.undefined)
  }
}
