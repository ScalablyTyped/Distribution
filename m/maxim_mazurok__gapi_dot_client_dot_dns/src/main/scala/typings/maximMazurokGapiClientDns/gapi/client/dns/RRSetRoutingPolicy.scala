package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicy extends js.Object {
  
  var geoPolicy: js.UndefOr[RRSetRoutingPolicyGeoPolicy] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var wrrPolicy: js.UndefOr[RRSetRoutingPolicyWrrPolicy] = js.native
}
object RRSetRoutingPolicy {
  
  @scala.inline
  def apply(): RRSetRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicy]
  }
  
  @scala.inline
  implicit class RRSetRoutingPolicyOps[Self <: RRSetRoutingPolicy] (val x: Self) extends AnyVal {
    
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
    def setGeoPolicy(value: RRSetRoutingPolicyGeoPolicy): Self = this.set("geoPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoPolicy: Self = this.set("geoPolicy", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setWrrPolicy(value: RRSetRoutingPolicyWrrPolicy): Self = this.set("wrrPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrrPolicy: Self = this.set("wrrPolicy", js.undefined)
  }
}
