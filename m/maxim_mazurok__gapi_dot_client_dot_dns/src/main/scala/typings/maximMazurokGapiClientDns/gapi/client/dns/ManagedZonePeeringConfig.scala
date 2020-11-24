package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonePeeringConfig extends js.Object {
  
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
  implicit class ManagedZonePeeringConfigOps[Self <: ManagedZonePeeringConfig] (val x: Self) extends AnyVal {
    
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
    def setTargetNetwork(value: ManagedZonePeeringConfigTargetNetwork): Self = this.set("targetNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNetwork: Self = this.set("targetNetwork", js.undefined)
  }
}
