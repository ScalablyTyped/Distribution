package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistTrack extends StObject {
  
  var album: js.UndefOr[String] = js.undefined
  
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  
  var albumArtist: js.UndefOr[String] = js.undefined
  
  var albumAvailableForPurchase: js.UndefOr[Boolean] = js.undefined
  
  var albumId: js.UndefOr[String] = js.undefined
  
  var artist: js.UndefOr[String] = js.undefined
  
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  
  var artistId: js.UndefOr[js.Array[String]] = js.undefined
  
  var composer: js.UndefOr[String] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var discNumber: js.UndefOr[Double] = js.undefined
  
  var durationMillis: js.UndefOr[String] = js.undefined
  
  var estimatedSize: js.UndefOr[String] = js.undefined
  
  var genre: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var nid: js.UndefOr[String] = js.undefined
  
  var playCount: js.UndefOr[Double] = js.undefined
  
  var storeId: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var trackAvailableForPurchase: js.UndefOr[Boolean] = js.undefined
  
  var trackAvailableForSubscription: js.UndefOr[Boolean] = js.undefined
  
  var trackNumber: js.UndefOr[Double] = js.undefined
  
  var trackType: js.UndefOr[String] = js.undefined
  
  var year: js.UndefOr[Double] = js.undefined
}
object PlaylistTrack {
  
  inline def apply(): PlaylistTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistTrack]
  }
  
  extension [Self <: PlaylistTrack](x: Self) {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtRef(value: js.Array[ArtRef]): Self = StObject.set(x, "albumArtRef", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtRefUndefined: Self = StObject.set(x, "albumArtRef", js.undefined)
    
    inline def setAlbumArtRefVarargs(value: ArtRef*): Self = StObject.set(x, "albumArtRef", js.Array(value :_*))
    
    inline def setAlbumArtist(value: String): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtistUndefined: Self = StObject.set(x, "albumArtist", js.undefined)
    
    inline def setAlbumAvailableForPurchase(value: Boolean): Self = StObject.set(x, "albumAvailableForPurchase", value.asInstanceOf[js.Any])
    
    inline def setAlbumAvailableForPurchaseUndefined: Self = StObject.set(x, "albumAvailableForPurchase", js.undefined)
    
    inline def setAlbumId(value: String): Self = StObject.set(x, "albumId", value.asInstanceOf[js.Any])
    
    inline def setAlbumIdUndefined: Self = StObject.set(x, "albumId", js.undefined)
    
    inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setArtistArtRef(value: js.Array[ArtRef]): Self = StObject.set(x, "artistArtRef", value.asInstanceOf[js.Any])
    
    inline def setArtistArtRefUndefined: Self = StObject.set(x, "artistArtRef", js.undefined)
    
    inline def setArtistArtRefVarargs(value: ArtRef*): Self = StObject.set(x, "artistArtRef", js.Array(value :_*))
    
    inline def setArtistId(value: js.Array[String]): Self = StObject.set(x, "artistId", value.asInstanceOf[js.Any])
    
    inline def setArtistIdUndefined: Self = StObject.set(x, "artistId", js.undefined)
    
    inline def setArtistIdVarargs(value: String*): Self = StObject.set(x, "artistId", js.Array(value :_*))
    
    inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    inline def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    inline def setComposerUndefined: Self = StObject.set(x, "composer", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
    
    inline def setDiscNumberUndefined: Self = StObject.set(x, "discNumber", js.undefined)
    
    inline def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    inline def setEstimatedSize(value: String): Self = StObject.set(x, "estimatedSize", value.asInstanceOf[js.Any])
    
    inline def setEstimatedSizeUndefined: Self = StObject.set(x, "estimatedSize", js.undefined)
    
    inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNid(value: String): Self = StObject.set(x, "nid", value.asInstanceOf[js.Any])
    
    inline def setNidUndefined: Self = StObject.set(x, "nid", js.undefined)
    
    inline def setPlayCount(value: Double): Self = StObject.set(x, "playCount", value.asInstanceOf[js.Any])
    
    inline def setPlayCountUndefined: Self = StObject.set(x, "playCount", js.undefined)
    
    inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrackAvailableForPurchase(value: Boolean): Self = StObject.set(x, "trackAvailableForPurchase", value.asInstanceOf[js.Any])
    
    inline def setTrackAvailableForPurchaseUndefined: Self = StObject.set(x, "trackAvailableForPurchase", js.undefined)
    
    inline def setTrackAvailableForSubscription(value: Boolean): Self = StObject.set(x, "trackAvailableForSubscription", value.asInstanceOf[js.Any])
    
    inline def setTrackAvailableForSubscriptionUndefined: Self = StObject.set(x, "trackAvailableForSubscription", js.undefined)
    
    inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackNumberUndefined: Self = StObject.set(x, "trackNumber", js.undefined)
    
    inline def setTrackType(value: String): Self = StObject.set(x, "trackType", value.asInstanceOf[js.Any])
    
    inline def setTrackTypeUndefined: Self = StObject.set(x, "trackType", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
