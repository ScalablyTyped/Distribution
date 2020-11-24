package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicyGeoPolicyGeoPolicyItem extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  /** The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g "us-east1", "southamerica-east1", "asia-east1", etc. */
  var location: js.UndefOr[String] = js.native
  
  var rrdatas: js.UndefOr[js.Array[String]] = js.native
  
  /** DNSSEC generated signatures for the above geo_rrdata. */
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.native
}
object RRSetRoutingPolicyGeoPolicyGeoPolicyItem {
  
  @scala.inline
  def apply(): RRSetRoutingPolicyGeoPolicyGeoPolicyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]
  }
  
  @scala.inline
  implicit class RRSetRoutingPolicyGeoPolicyGeoPolicyItemOps[Self <: RRSetRoutingPolicyGeoPolicyGeoPolicyItem] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setRrdatasVarargs(value: String*): Self = this.set("rrdatas", js.Array(value :_*))
    
    @scala.inline
    def setRrdatas(value: js.Array[String]): Self = this.set("rrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRrdatas: Self = this.set("rrdatas", js.undefined)
    
    @scala.inline
    def setSignatureRrdatasVarargs(value: String*): Self = this.set("signatureRrdatas", js.Array(value :_*))
    
    @scala.inline
    def setSignatureRrdatas(value: js.Array[String]): Self = this.set("signatureRrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureRrdatas: Self = this.set("signatureRrdatas", js.undefined)
  }
}
