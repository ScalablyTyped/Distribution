package typings.musickitJs.anon

import typings.musickitJs.MusicKit.PlayParameters
import typings.musickitJs.MusicKit.Preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlbumName extends StObject {
  
  var albumName: String
  
  var artistName: String
  
  var artistUrl: js.UndefOr[String] = js.undefined
  
  var artwork: typings.musickitJs.MusicKit.Artwork
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var composerName: js.UndefOr[String] = js.undefined
  
  var contentRating: js.UndefOr[typings.musickitJs.MusicKit.ContentRating] = js.undefined
  
  var discNumber: js.UndefOr[Double] = js.undefined
  
  var durationInMillis: Double
  
  var editorialNotes: js.UndefOr[typings.musickitJs.MusicKit.EditorialNotes] = js.undefined
  
  var genreNames: js.Array[String]
  
  var hasLyrics: Boolean
  
  var isrc: js.UndefOr[String] = js.undefined
  
  var movementCount: js.UndefOr[Double] = js.undefined
  
  var movementName: js.UndefOr[String] = js.undefined
  
  var movementNumber: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var playParams: js.UndefOr[PlayParameters] = js.undefined
  
  var previews: js.Array[Preview]
  
  var releaseDate: js.UndefOr[String] = js.undefined
  
  var trackNumber: js.UndefOr[Double] = js.undefined
  
  var url: String
  
  var workName: js.UndefOr[String] = js.undefined
}
object AlbumName {
  
  inline def apply(
    albumName: String,
    artistName: String,
    artwork: typings.musickitJs.MusicKit.Artwork,
    durationInMillis: Double,
    genreNames: js.Array[String],
    hasLyrics: Boolean,
    name: String,
    previews: js.Array[Preview],
    url: String
  ): AlbumName = {
    val __obj = js.Dynamic.literal(albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], durationInMillis = durationInMillis.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], hasLyrics = hasLyrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumName]
  }
  
  extension [Self <: AlbumName](x: Self) {
    
    inline def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
    
    inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    inline def setArtistUrl(value: String): Self = StObject.set(x, "artistUrl", value.asInstanceOf[js.Any])
    
    inline def setArtistUrlUndefined: Self = StObject.set(x, "artistUrl", js.undefined)
    
    inline def setArtwork(value: typings.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setComposerName(value: String): Self = StObject.set(x, "composerName", value.asInstanceOf[js.Any])
    
    inline def setComposerNameUndefined: Self = StObject.set(x, "composerName", js.undefined)
    
    inline def setContentRating(value: typings.musickitJs.MusicKit.ContentRating): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingNull: Self = StObject.set(x, "contentRating", null)
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
    
    inline def setDiscNumberUndefined: Self = StObject.set(x, "discNumber", js.undefined)
    
    inline def setDurationInMillis(value: Double): Self = StObject.set(x, "durationInMillis", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotes(value: typings.musickitJs.MusicKit.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
    
    inline def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
    
    inline def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value*))
    
    inline def setHasLyrics(value: Boolean): Self = StObject.set(x, "hasLyrics", value.asInstanceOf[js.Any])
    
    inline def setIsrc(value: String): Self = StObject.set(x, "isrc", value.asInstanceOf[js.Any])
    
    inline def setIsrcUndefined: Self = StObject.set(x, "isrc", js.undefined)
    
    inline def setMovementCount(value: Double): Self = StObject.set(x, "movementCount", value.asInstanceOf[js.Any])
    
    inline def setMovementCountUndefined: Self = StObject.set(x, "movementCount", js.undefined)
    
    inline def setMovementName(value: String): Self = StObject.set(x, "movementName", value.asInstanceOf[js.Any])
    
    inline def setMovementNameUndefined: Self = StObject.set(x, "movementName", js.undefined)
    
    inline def setMovementNumber(value: Double): Self = StObject.set(x, "movementNumber", value.asInstanceOf[js.Any])
    
    inline def setMovementNumberUndefined: Self = StObject.set(x, "movementNumber", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
    
    inline def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
    
    inline def setPreviews(value: js.Array[Preview]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
    
    inline def setPreviewsVarargs(value: Preview*): Self = StObject.set(x, "previews", js.Array(value*))
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackNumberUndefined: Self = StObject.set(x, "trackNumber", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWorkName(value: String): Self = StObject.set(x, "workName", value.asInstanceOf[js.Any])
    
    inline def setWorkNameUndefined: Self = StObject.set(x, "workName", js.undefined)
  }
}
