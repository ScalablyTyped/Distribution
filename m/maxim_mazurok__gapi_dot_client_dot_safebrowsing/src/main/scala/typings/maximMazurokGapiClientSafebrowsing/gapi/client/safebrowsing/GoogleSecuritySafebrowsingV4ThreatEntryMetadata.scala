package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ThreatEntryMetadata extends StObject {
  
  /** The metadata entries. */
  var entries: js.UndefOr[js.Array[GoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry]] = js.undefined
}
object GoogleSecuritySafebrowsingV4ThreatEntryMetadata {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ThreatEntryMetadata]
  }
  
  extension [Self <: GoogleSecuritySafebrowsingV4ThreatEntryMetadata](x: Self) {
    
    inline def setEntries(value: js.Array[GoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: GoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
