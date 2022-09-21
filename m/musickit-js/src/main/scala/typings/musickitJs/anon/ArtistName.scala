package typings.musickitJs.anon

import typings.musickitJs.MusicKit.PlayParameters
import typings.musickitJs.MusicKit.Preview
import typings.musickitJs.musickitJsStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtistName extends StObject {
  
  var albumName: js.UndefOr[String] = js.undefined
  
  var artistName: String
  
  var artistUrl: js.UndefOr[String] = js.undefined
  
  var artwork: typings.musickitJs.MusicKit.Artwork
  
  var contentRating: js.UndefOr[typings.musickitJs.MusicKit.ContentRating] = js.undefined
  
  var durationInMillis: Double
  
  var editorialNotes: js.UndefOr[typings.musickitJs.MusicKit.EditorialNotes] = js.undefined
  
  var genreNames: js.Array[String]
  
  var has4K: Boolean
  
  var hasHDR: Boolean
  
  var isrc: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var playParams: js.UndefOr[PlayParameters] = js.undefined
  
  var previews: js.Array[Preview]
  
  var releaseDate: js.UndefOr[String] = js.undefined
  
  var trackNumber: js.UndefOr[Double] = js.undefined
  
  var url: String
  
  var videoSubType: js.UndefOr[preview] = js.undefined
  
  var workId: js.UndefOr[String] = js.undefined
  
  var workName: js.UndefOr[String] = js.undefined
}
object ArtistName {
  
  inline def apply(
    artistName: String,
    artwork: typings.musickitJs.MusicKit.Artwork,
    durationInMillis: Double,
    genreNames: js.Array[String],
    has4K: Boolean,
    hasHDR: Boolean,
    name: String,
    previews: js.Array[Preview],
    url: String
  ): ArtistName = {
    val __obj = js.Dynamic.literal(artistName = artistName.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], durationInMillis = durationInMillis.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], has4K = has4K.asInstanceOf[js.Any], hasHDR = hasHDR.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistName]
  }
  
  extension [Self <: ArtistName](x: Self) {
    
    inline def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
    
    inline def setAlbumNameUndefined: Self = StObject.set(x, "albumName", js.undefined)
    
    inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    inline def setArtistUrl(value: String): Self = StObject.set(x, "artistUrl", value.asInstanceOf[js.Any])
    
    inline def setArtistUrlUndefined: Self = StObject.set(x, "artistUrl", js.undefined)
    
    inline def setArtwork(value: typings.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setContentRating(value: typings.musickitJs.MusicKit.ContentRating): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingNull: Self = StObject.set(x, "contentRating", null)
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setDurationInMillis(value: Double): Self = StObject.set(x, "durationInMillis", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotes(value: typings.musickitJs.MusicKit.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
    
    inline def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
    
    inline def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value*))
    
    inline def setHas4K(value: Boolean): Self = StObject.set(x, "has4K", value.asInstanceOf[js.Any])
    
    inline def setHasHDR(value: Boolean): Self = StObject.set(x, "hasHDR", value.asInstanceOf[js.Any])
    
    inline def setIsrc(value: String): Self = StObject.set(x, "isrc", value.asInstanceOf[js.Any])
    
    inline def setIsrcUndefined: Self = StObject.set(x, "isrc", js.undefined)
    
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
    
    inline def setVideoSubType(value: preview): Self = StObject.set(x, "videoSubType", value.asInstanceOf[js.Any])
    
    inline def setVideoSubTypeUndefined: Self = StObject.set(x, "videoSubType", js.undefined)
    
    inline def setWorkId(value: String): Self = StObject.set(x, "workId", value.asInstanceOf[js.Any])
    
    inline def setWorkIdUndefined: Self = StObject.set(x, "workId", js.undefined)
    
    inline def setWorkName(value: String): Self = StObject.set(x, "workName", value.asInstanceOf[js.Any])
    
    inline def setWorkNameUndefined: Self = StObject.set(x, "workName", js.undefined)
  }
}
