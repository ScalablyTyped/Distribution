package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonePrivateVisibilityConfig extends js.Object {
  
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
  implicit class ManagedZonePrivateVisibilityConfigOps[Self <: ManagedZonePrivateVisibilityConfig] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: ManagedZonePrivateVisibilityConfigNetwork*): Self = this.set("networks", js.Array(value :_*))
    
    @scala.inline
    def setNetworks(value: js.Array[ManagedZonePrivateVisibilityConfigNetwork]): Self = this.set("networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworks: Self = this.set("networks", js.undefined)
  }
}
