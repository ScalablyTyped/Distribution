package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRecordSet extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** For example, www.example.com. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static)
    * or routing_policy(dynamic). An error is returned otherwise.
    */
  var routingPolicy: js.UndefOr[RRSetRoutingPolicy] = js.undefined
  
  /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples. */
  var rrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  /** As defined in RFC 4034 (section 3.2). */
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Number of seconds that this ResourceRecordSet can be cached by resolvers. */
  var ttl: js.UndefOr[Double] = js.undefined
  
  /** The identifier of a supported record type. See the list of Supported DNS record types. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ResourceRecordSet {
  
  inline def apply(): ResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRecordSet]
  }
  
  extension [Self <: ResourceRecordSet](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoutingPolicy(value: RRSetRoutingPolicy): Self = StObject.set(x, "routingPolicy", value.asInstanceOf[js.Any])
    
    inline def setRoutingPolicyUndefined: Self = StObject.set(x, "routingPolicy", js.undefined)
    
    inline def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    inline def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    inline def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value :_*))
    
    inline def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    inline def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    inline def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value :_*))
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
