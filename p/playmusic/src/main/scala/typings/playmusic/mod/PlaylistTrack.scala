package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistTrack extends StObject {
  
  var album: js.UndefOr[String] = js.native
  
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  
  var albumArtist: js.UndefOr[String] = js.native
  
  var albumAvailableForPurchase: js.UndefOr[Boolean] = js.native
  
  var albumId: js.UndefOr[String] = js.native
  
  var artist: js.UndefOr[String] = js.native
  
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  
  var artistId: js.UndefOr[js.Array[String]] = js.native
  
  var composer: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var discNumber: js.UndefOr[Double] = js.native
  
  var durationMillis: js.UndefOr[String] = js.native
  
  var estimatedSize: js.UndefOr[String] = js.native
  
  var genre: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nid: js.UndefOr[String] = js.native
  
  var playCount: js.UndefOr[Double] = js.native
  
  var storeId: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var trackAvailableForPurchase: js.UndefOr[Boolean] = js.native
  
  var trackAvailableForSubscription: js.UndefOr[Boolean] = js.native
  
  var trackNumber: js.UndefOr[Double] = js.native
  
  var trackType: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[Double] = js.native
}
object PlaylistTrack {
  
  @scala.inline
  def apply(): PlaylistTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistTrack]
  }
  
  @scala.inline
  implicit class PlaylistTrackMutableBuilder[Self <: PlaylistTrack] (val x: Self) extends AnyVal {
    
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
    def setAlbumAvailableForPurchase(value: Boolean): Self = StObject.set(x, "albumAvailableForPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumAvailableForPurchaseUndefined: Self = StObject.set(x, "albumAvailableForPurchase", js.undefined)
    
    @scala.inline
    def setAlbumId(value: String): Self = StObject.set(x, "albumId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumIdUndefined: Self = StObject.set(x, "albumId", js.undefined)
    
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
    def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposerUndefined: Self = StObject.set(x, "composer", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
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
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNid(value: String): Self = StObject.set(x, "nid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNidUndefined: Self = StObject.set(x, "nid", js.undefined)
    
    @scala.inline
    def setPlayCount(value: Double): Self = StObject.set(x, "playCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayCountUndefined: Self = StObject.set(x, "playCount", js.undefined)
    
    @scala.inline
    def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTrackAvailableForPurchase(value: Boolean): Self = StObject.set(x, "trackAvailableForPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackAvailableForPurchaseUndefined: Self = StObject.set(x, "trackAvailableForPurchase", js.undefined)
    
    @scala.inline
    def setTrackAvailableForSubscription(value: Boolean): Self = StObject.set(x, "trackAvailableForSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackAvailableForSubscriptionUndefined: Self = StObject.set(x, "trackAvailableForSubscription", js.undefined)
    
    @scala.inline
    def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackNumberUndefined: Self = StObject.set(x, "trackNumber", js.undefined)
    
    @scala.inline
    def setTrackType(value: String): Self = StObject.set(x, "trackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackTypeUndefined: Self = StObject.set(x, "trackType", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
