package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZonePeeringConfigTargetNetwork extends StObject {
  
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
  implicit class ManagedZonePeeringConfigTargetNetworkMutableBuilder[Self <: ManagedZonePeeringConfigTargetNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeactivateTime(value: String): Self = StObject.set(x, "deactivateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivateTimeUndefined: Self = StObject.set(x, "deactivateTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
  }
}
