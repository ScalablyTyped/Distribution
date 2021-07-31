package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatEntryMetadata extends StObject {
  
  /** The metadata entries. */
  var entries: js.UndefOr[js.Array[MetadataEntry]] = js.undefined
}
object ThreatEntryMetadata {
  
  @scala.inline
  def apply(): ThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatEntryMetadata]
  }
  
  @scala.inline
  implicit class ThreatEntryMetadataMutableBuilder[Self <: ThreatEntryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[MetadataEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: MetadataEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
