package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZoneForwardingConfig extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  /** List of target name servers to forward to. Cloud DNS will select the best available name server if more than one target is given. */
  var targetNameServers: js.UndefOr[js.Array[ManagedZoneForwardingConfigNameServerTarget]] = js.native
}
object ManagedZoneForwardingConfig {
  
  @scala.inline
  def apply(): ManagedZoneForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneForwardingConfig]
  }
  
  @scala.inline
  implicit class ManagedZoneForwardingConfigOps[Self <: ManagedZoneForwardingConfig] (val x: Self) extends AnyVal {
    
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
    def setTargetNameServersVarargs(value: ManagedZoneForwardingConfigNameServerTarget*): Self = this.set("targetNameServers", js.Array(value :_*))
    
    @scala.inline
    def setTargetNameServers(value: js.Array[ManagedZoneForwardingConfigNameServerTarget]): Self = this.set("targetNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNameServers: Self = this.set("targetNameServers", js.undefined)
  }
}
