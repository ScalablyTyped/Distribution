package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsKey extends js.Object {
  
  /** String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time. */
  var algorithm: js.UndefOr[String] = js.native
  
  /** The time that this resource was created in the control plane. This is in RFC3339 text format. Output only. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the resource's function. */
  var description: js.UndefOr[String] = js.native
  
  /** Cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests are needed to construct a DS record that points at this DNS key. Output only. */
  var digests: js.UndefOr[js.Array[DnsKeyDigest]] = js.native
  
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will still be present as DNSKEY Resource Records for the use of resolvers validating existing
    * signatures.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  
  /** Length of the key in bits. Specified at creation time then immutable. */
  var keyLength: js.UndefOr[Double] = js.native
  
  /**
    * The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a
    * unique identifier). In particular, the key tag is used in a parent zone's DS record to point at the DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535]
    * and the algorithm to calculate it is specified in RFC4034 Appendix B. Output only.
    */
  var keyTag: js.UndefOr[Double] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** Base64 encoded public half of this key. Output only. */
  var publicKey: js.UndefOr[String] = js.native
  
  /**
    * One of "KEY_SIGNING" or "ZONE_SIGNING". Keys of type KEY_SIGNING have the Secure Entry Point flag set and, when active, will be used to sign only resource record sets of type
    * DNSKEY. Otherwise, the Secure Entry Point flag will be cleared and this key will be used to sign only resource record sets of other types. Immutable after creation time.
    */
  var `type`: js.UndefOr[String] = js.native
}
object DnsKey {
  
  @scala.inline
  def apply(): DnsKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsKey]
  }
  
  @scala.inline
  implicit class DnsKeyOps[Self <: DnsKey] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDigestsVarargs(value: DnsKeyDigest*): Self = this.set("digests", js.Array(value :_*))
    
    @scala.inline
    def setDigests(value: js.Array[DnsKeyDigest]): Self = this.set("digests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigests: Self = this.set("digests", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyLength: Self = this.set("keyLength", js.undefined)
    
    @scala.inline
    def setKeyTag(value: Double): Self = this.set("keyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyTag: Self = this.set("keyTag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
