package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DsRecord extends StObject {
  
  /** The algorithm used to generate the referenced DNSKEY. */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /** The digest generated from the referenced DNSKEY. */
  var digest: js.UndefOr[String] = js.undefined
  
  /** The hash function used to generate the digest of the referenced DNSKEY. */
  var digestType: js.UndefOr[String] = js.undefined
  
  /** The key tag of the record. Must be set in range 0 -- 65535. */
  var keyTag: js.UndefOr[Double] = js.undefined
}
object DsRecord {
  
  @scala.inline
  def apply(): DsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DsRecord]
  }
  
  @scala.inline
  implicit class DsRecordMutableBuilder[Self <: DsRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestType(value: String): Self = StObject.set(x, "digestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTypeUndefined: Self = StObject.set(x, "digestType", js.undefined)
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setKeyTag(value: Double): Self = StObject.set(x, "keyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTagUndefined: Self = StObject.set(x, "keyTag", js.undefined)
  }
}
