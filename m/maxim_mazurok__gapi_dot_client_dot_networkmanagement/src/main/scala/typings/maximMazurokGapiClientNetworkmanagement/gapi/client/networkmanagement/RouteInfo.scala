package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteInfo extends js.Object {
  
  /** Destination IP range of the route. */
  var destIpRange: js.UndefOr[String] = js.native
  
  /** Name of a Compute Engine route. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Instance tags of the route. */
  var instanceTags: js.UndefOr[js.Array[String]] = js.native
  
  /** URI of a Compute Engine network. */
  var networkUri: js.UndefOr[String] = js.native
  
  /** Next hop of the route. */
  var nextHop: js.UndefOr[String] = js.native
  
  /** Type of next hop. */
  var nextHopType: js.UndefOr[String] = js.native
  
  /** Priority of the route. */
  var priority: js.UndefOr[Double] = js.native
  
  /** Type of route. */
  var routeType: js.UndefOr[String] = js.native
  
  /** URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI. */
  var uri: js.UndefOr[String] = js.native
}
object RouteInfo {
  
  @scala.inline
  def apply(): RouteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteInfo]
  }
  
  @scala.inline
  implicit class RouteInfoOps[Self <: RouteInfo] (val x: Self) extends AnyVal {
    
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
    def setDestIpRange(value: String): Self = this.set("destIpRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestIpRange: Self = this.set("destIpRange", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setInstanceTagsVarargs(value: String*): Self = this.set("instanceTags", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTags(value: js.Array[String]): Self = this.set("instanceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTags: Self = this.set("instanceTags", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = this.set("networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUri: Self = this.set("networkUri", js.undefined)
    
    @scala.inline
    def setNextHop(value: String): Self = this.set("nextHop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextHop: Self = this.set("nextHop", js.undefined)
    
    @scala.inline
    def setNextHopType(value: String): Self = this.set("nextHopType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextHopType: Self = this.set("nextHopType", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setRouteType(value: String): Self = this.set("routeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteType: Self = this.set("routeType", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
