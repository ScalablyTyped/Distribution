package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRecordSet extends StObject {
  
  var kind: js.UndefOr[String] = js.native
  
  /** For example, www.example.com. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static)
    * or routing_policy(dynamic). An error is returned otherwise.
    */
  var routingPolicy: js.UndefOr[RRSetRoutingPolicy] = js.native
  
  /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples. */
  var rrdatas: js.UndefOr[js.Array[String]] = js.native
  
  /** As defined in RFC 4034 (section 3.2). */
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.native
  
  /** Number of seconds that this ResourceRecordSet can be cached by resolvers. */
  var ttl: js.UndefOr[Double] = js.native
  
  /** The identifier of a supported record type. See the list of Supported DNS record types. */
  var `type`: js.UndefOr[String] = js.native
}
object ResourceRecordSet {
  
  @scala.inline
  def apply(): ResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRecordSet]
  }
  
  @scala.inline
  implicit class ResourceRecordSetMutableBuilder[Self <: ResourceRecordSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoutingPolicy(value: RRSetRoutingPolicy): Self = StObject.set(x, "routingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingPolicyUndefined: Self = StObject.set(x, "routingPolicy", js.undefined)
    
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
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
