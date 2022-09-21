package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ThreatEntrySet extends StObject {
  
  /** The compression type for the entries in this set. */
  var compressionType: js.UndefOr[String] = js.undefined
  
  /** The raw SHA256-formatted entries. */
  var rawHashes: js.UndefOr[GoogleSecuritySafebrowsingV4RawHashes] = js.undefined
  
  /** The raw removal indices for a local list. */
  var rawIndices: js.UndefOr[GoogleSecuritySafebrowsingV4RawIndices] = js.undefined
  
  /**
    * The encoded 4-byte prefixes of SHA256-formatted entries, using a Golomb-Rice encoding. The hashes are converted to uint32, sorted in ascending order, then delta encoded and stored
    * as encoded_data.
    */
  var riceHashes: js.UndefOr[GoogleSecuritySafebrowsingV4RiceDeltaEncoding] = js.undefined
  
  /**
    * The encoded local, lexicographically-sorted list indices, using a Golomb-Rice encoding. Used for sending compressed removal indices. The removal indices (uint32) are sorted in
    * ascending order, then delta encoded and stored as encoded_data.
    */
  var riceIndices: js.UndefOr[GoogleSecuritySafebrowsingV4RiceDeltaEncoding] = js.undefined
}
object GoogleSecuritySafebrowsingV4ThreatEntrySet {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ThreatEntrySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ThreatEntrySet]
  }
  
  extension [Self <: GoogleSecuritySafebrowsingV4ThreatEntrySet](x: Self) {
    
    inline def setCompressionType(value: String): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
    
    inline def setRawHashes(value: GoogleSecuritySafebrowsingV4RawHashes): Self = StObject.set(x, "rawHashes", value.asInstanceOf[js.Any])
    
    inline def setRawHashesUndefined: Self = StObject.set(x, "rawHashes", js.undefined)
    
    inline def setRawIndices(value: GoogleSecuritySafebrowsingV4RawIndices): Self = StObject.set(x, "rawIndices", value.asInstanceOf[js.Any])
    
    inline def setRawIndicesUndefined: Self = StObject.set(x, "rawIndices", js.undefined)
    
    inline def setRiceHashes(value: GoogleSecuritySafebrowsingV4RiceDeltaEncoding): Self = StObject.set(x, "riceHashes", value.asInstanceOf[js.Any])
    
    inline def setRiceHashesUndefined: Self = StObject.set(x, "riceHashes", js.undefined)
    
    inline def setRiceIndices(value: GoogleSecuritySafebrowsingV4RiceDeltaEncoding): Self = StObject.set(x, "riceIndices", value.asInstanceOf[js.Any])
    
    inline def setRiceIndicesUndefined: Self = StObject.set(x, "riceIndices", js.undefined)
  }
}
