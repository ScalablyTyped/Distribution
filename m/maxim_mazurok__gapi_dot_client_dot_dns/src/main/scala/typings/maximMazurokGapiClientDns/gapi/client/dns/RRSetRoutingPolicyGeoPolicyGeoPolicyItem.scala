package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicyGeoPolicyGeoPolicyItem extends StObject {
  
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
  implicit class RRSetRoutingPolicyGeoPolicyGeoPolicyItemMutableBuilder[Self <: RRSetRoutingPolicyGeoPolicyGeoPolicyItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    @scala.inline
    def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value :_*))
    
    @scala.inline
    def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    @scala.inline
    def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value :_*))
  }
}
