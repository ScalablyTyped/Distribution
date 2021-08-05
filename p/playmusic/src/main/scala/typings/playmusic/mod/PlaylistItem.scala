package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistItem extends StObject {
  
  var absolutePosition: js.UndefOr[String] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var lastModifiedTimestamp: js.UndefOr[String] = js.undefined
  
  var playlistId: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var track: js.UndefOr[PlaylistTrack] = js.undefined
  
  var trackId: js.UndefOr[String] = js.undefined
}
object PlaylistItem {
  
  inline def apply(): PlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistItem]
  }
  
  extension [Self <: PlaylistItem](x: Self) {
    
    inline def setAbsolutePosition(value: String): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedTimestamp(value: String): Self = StObject.set(x, "lastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimestampUndefined: Self = StObject.set(x, "lastModifiedTimestamp", js.undefined)
    
    inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTrack(value: PlaylistTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackId(value: String): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    inline def setTrackIdUndefined: Self = StObject.set(x, "trackId", js.undefined)
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
