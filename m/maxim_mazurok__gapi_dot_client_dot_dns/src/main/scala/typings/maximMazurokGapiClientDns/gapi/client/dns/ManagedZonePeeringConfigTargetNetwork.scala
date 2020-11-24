package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonePeeringConfigTargetNetwork extends js.Object {
  
  /**
    * The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a
    * zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
    */
  var deactivateTime: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network} */
  var networkUrl: js.UndefOr[String] = js.native
}
object ManagedZonePeeringConfigTargetNetwork {
  
  @scala.inline
  def apply(): ManagedZonePeeringConfigTargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZonePeeringConfigTargetNetwork]
  }
  
  @scala.inline
  implicit class ManagedZonePeeringConfigTargetNetworkOps[Self <: ManagedZonePeeringConfigTargetNetwork] (val x: Self) extends AnyVal {
    
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
    def setDeactivateTime(value: String): Self = this.set("deactivateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeactivateTime: Self = this.set("deactivateTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNetworkUrl(value: String): Self = this.set("networkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUrl: Self = this.set("networkUrl", js.undefined)
  }
}
