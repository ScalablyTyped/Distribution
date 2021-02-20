package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibraryItem extends StObject {
  
  var album: js.UndefOr[String] = js.native
  
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  
  var albumArtist: js.UndefOr[String] = js.native
  
  var artist: js.UndefOr[String] = js.native
  
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  
  var artistId: js.UndefOr[js.Array[String]] = js.native
  
  var beatsPerMinute: js.UndefOr[Double] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var composer: js.UndefOr[String] = js.native
  
  var creationTimestamp: js.UndefOr[String] = js.native
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var discNumber: js.UndefOr[Double] = js.native
  
  var durationMillis: js.UndefOr[String] = js.native
  
  var estimatedSize: js.UndefOr[String] = js.native
  
  var genre: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifiedTimestamp: js.UndefOr[String] = js.native
  
  var nid: js.UndefOr[String] = js.native
  
  var playCount: js.UndefOr[Double] = js.native
  
  var rating: js.UndefOr[String] = js.native
  
  var recentTimestamp: js.UndefOr[String] = js.native
  
  var storeId: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var totalDiscCount: js.UndefOr[Double] = js.native
  
  var totalTrackCount: js.UndefOr[Double] = js.native
  
  var trackNumber: js.UndefOr[Double] = js.native
  
  var year: js.UndefOr[Double] = js.native
}
object LibraryItem {
  
  @scala.inline
  def apply(): LibraryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryItem]
  }
  
  @scala.inline
  implicit class LibraryItemMutableBuilder[Self <: LibraryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumArtRef(value: js.Array[ArtRef]): Self = StObject.set(x, "albumArtRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumArtRefUndefined: Self = StObject.set(x, "albumArtRef", js.undefined)
    
    @scala.inline
    def setAlbumArtRefVarargs(value: ArtRef*): Self = StObject.set(x, "albumArtRef", js.Array(value :_*))
    
    @scala.inline
    def setAlbumArtist(value: String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumArtistUndefined: Self = StObject.set(x, "albumArtist", js.undefined)
    
    @scala.inline
    def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    @scala.inline
    def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistArtRef(value: js.Array[ArtRef]): Self = StObject.set(x, "artistArtRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistArtRefUndefined: Self = StObject.set(x, "artistArtRef", js.undefined)
    
    @scala.inline
    def setArtistArtRefVarargs(value: ArtRef*): Self = StObject.set(x, "artistArtRef", js.Array(value :_*))
    
    @scala.inline
    def setArtistId(value: js.Array[String]): Self = StObject.set(x, "artistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistIdUndefined: Self = StObject.set(x, "artistId", js.undefined)
    
    @scala.inline
    def setArtistIdVarargs(value: String*): Self = StObject.set(x, "artistId", js.Array(value :_*))
    
    @scala.inline
    def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    @scala.inline
    def setBeatsPerMinute(value: Double): Self = StObject.set(x, "beatsPerMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeatsPerMinuteUndefined: Self = StObject.set(x, "beatsPerMinute", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposerUndefined: Self = StObject.set(x, "composer", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscNumberUndefined: Self = StObject.set(x, "discNumber", js.undefined)
    
    @scala.inline
    def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    @scala.inline
    def setEstimatedSize(value: String): Self = StObject.set(x, "estimatedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSizeUndefined: Self = StObject.set(x, "estimatedSize", js.undefined)
    
    @scala.inline
    def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
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
    def setNid(value: String): Self = StObject.set(x, "nid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNidUndefined: Self = StObject.set(x, "nid", js.undefined)
    
    @scala.inline
    def setPlayCount(value: Double): Self = StObject.set(x, "playCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayCountUndefined: Self = StObject.set(x, "playCount", js.undefined)
    
    @scala.inline
    def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    @scala.inline
    def setRecentTimestamp(value: String): Self = StObject.set(x, "recentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecentTimestampUndefined: Self = StObject.set(x, "recentTimestamp", js.undefined)
    
    @scala.inline
    def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTotalDiscCount(value: Double): Self = StObject.set(x, "totalDiscCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDiscCountUndefined: Self = StObject.set(x, "totalDiscCount", js.undefined)
    
    @scala.inline
    def setTotalTrackCount(value: Double): Self = StObject.set(x, "totalTrackCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTrackCountUndefined: Self = StObject.set(x, "totalTrackCount", js.undefined)
    
    @scala.inline
    def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackNumberUndefined: Self = StObject.set(x, "trackNumber", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
