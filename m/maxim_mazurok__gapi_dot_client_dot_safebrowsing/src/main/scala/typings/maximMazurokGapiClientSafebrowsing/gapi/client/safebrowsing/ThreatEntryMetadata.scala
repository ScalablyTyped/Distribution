package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatEntryMetadata extends StObject {
  
  /** The metadata entries. */
  var entries: js.UndefOr[js.Array[MetadataEntry]] = js.undefined
}
object ThreatEntryMetadata {
  
  inline def apply(): ThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatEntryMetadata]
  }
  
  extension [Self <: ThreatEntryMetadata](x: Self) {
    
    inline def setEntries(value: js.Array[MetadataEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: MetadataEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
