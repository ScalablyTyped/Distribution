package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsKey extends StObject {
  
  /** String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time. */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /** The time that this resource was created in the control plane. This is in RFC3339 text format. Output only. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the resource's function. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests are needed to construct a DS record that points at this DNS key. Output only. */
  var digests: js.UndefOr[js.Array[DnsKeyDigest]] = js.undefined
  
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will still be present as DNSKEY Resource Records for the use of resolvers validating existing
    * signatures.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /** Length of the key in bits. Specified at creation time then immutable. */
  var keyLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a
    * unique identifier). In particular, the key tag is used in a parent zone's DS record to point at the DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535]
    * and the algorithm to calculate it is specified in RFC4034 Appendix B. Output only.
    */
  var keyTag: js.UndefOr[Double] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** Base64 encoded public half of this key. Output only. */
  var publicKey: js.UndefOr[String] = js.undefined
  
  /**
    * One of "KEY_SIGNING" or "ZONE_SIGNING". Keys of type KEY_SIGNING have the Secure Entry Point flag set and, when active, will be used to sign only resource record sets of type
    * DNSKEY. Otherwise, the Secure Entry Point flag will be cleared and this key will be used to sign only resource record sets of other types. Immutable after creation time.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object DnsKey {
  
  inline def apply(): DnsKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsKey]
  }
  
  extension [Self <: DnsKey](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDigests(value: js.Array[DnsKeyDigest]): Self = StObject.set(x, "digests", value.asInstanceOf[js.Any])
    
    inline def setDigestsUndefined: Self = StObject.set(x, "digests", js.undefined)
    
    inline def setDigestsVarargs(value: DnsKeyDigest*): Self = StObject.set(x, "digests", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setKeyTag(value: Double): Self = StObject.set(x, "keyTag", value.asInstanceOf[js.Any])
    
    inline def setKeyTagUndefined: Self = StObject.set(x, "keyTag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
