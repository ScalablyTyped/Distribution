package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistItem extends StObject {
  
  var absolutePosition: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var creationTimestamp: js.UndefOr[String] = js.native
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifiedTimestamp: js.UndefOr[String] = js.native
  
  var playlistId: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var track: js.UndefOr[PlaylistTrack] = js.native
  
  var trackId: js.UndefOr[String] = js.native
}
object PlaylistItem {
  
  @scala.inline
  def apply(): PlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistItem]
  }
  
  @scala.inline
  implicit class PlaylistItemMutableBuilder[Self <: PlaylistItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePosition(value: String): Self = StObject.set(x, "absolutePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePositionUndefined: Self = StObject.set(x, "absolutePosition", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedTimestamp(value: String): Self = StObject.set(x, "lastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimestampUndefined: Self = StObject.set(x, "lastModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTrack(value: PlaylistTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackId(value: String): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIdUndefined: Self = StObject.set(x, "trackId", js.undefined)
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
