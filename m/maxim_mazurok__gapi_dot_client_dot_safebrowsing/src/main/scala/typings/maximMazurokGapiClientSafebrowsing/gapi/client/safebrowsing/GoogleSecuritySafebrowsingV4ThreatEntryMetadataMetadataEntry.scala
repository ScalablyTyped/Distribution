package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry extends StObject {
  
  /** The metadata entry key. For JSON requests, the key is base64-encoded. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The metadata entry value. For JSON requests, the value is base64-encoded. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleSecuritySafebrowsingV4ThreatEntryMetadataMetadataEntry] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
