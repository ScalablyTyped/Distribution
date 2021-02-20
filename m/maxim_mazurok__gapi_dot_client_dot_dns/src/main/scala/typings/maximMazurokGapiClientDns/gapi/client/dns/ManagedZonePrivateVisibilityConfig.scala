package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonePrivateVisibilityConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.native
  
  /** The list of VPC networks that can see this zone. */
  var networks: js.UndefOr[js.Array[ManagedZonePrivateVisibilityConfigNetwork]] = js.native
}
object ManagedZonePrivateVisibilityConfig {
  
  @scala.inline
  def apply(): ManagedZonePrivateVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonePrivateVisibilityConfig]
  }
  
  @scala.inline
  implicit class ManagedZonePrivateVisibilityConfigMutableBuilder[Self <: ManagedZonePrivateVisibilityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworks(value: js.Array[ManagedZonePrivateVisibilityConfigNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: ManagedZonePrivateVisibilityConfigNetwork*): Self = StObject.set(x, "networks", js.Array(value :_*))
  }
}
