package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DsRecord extends js.Object {
  
  /** The algorithm used to generate the referenced DNSKEY. */
  var algorithm: js.UndefOr[String] = js.native
  
  /** The digest generated from the referenced DNSKEY. */
  var digest: js.UndefOr[String] = js.native
  
  /** The hash function used to generate the digest of the referenced DNSKEY. */
  var digestType: js.UndefOr[String] = js.native
  
  /** The key tag of the record. Must be set in range 0 -- 65535. */
  var keyTag: js.UndefOr[Double] = js.native
}
object DsRecord {
  
  @scala.inline
  def apply(): DsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DsRecord]
  }
  
  @scala.inline
  implicit class DsRecordOps[Self <: DsRecord] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    
    @scala.inline
    def setDigestType(value: String): Self = this.set("digestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestType: Self = this.set("digestType", js.undefined)
    
    @scala.inline
    def setKeyTag(value: Double): Self = this.set("keyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyTag: Self = this.set("keyTag", js.undefined)
  }
}
