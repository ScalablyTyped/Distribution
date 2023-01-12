package typings.musickitJs.anon

import typings.musickitJs.MusicKit.PlayParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtistUrl extends StObject {
  
  var Possible: js.UndefOr[typings.musickitJs.MusicKit.ContentRating] = js.undefined
  
  var artistName: String
  
  var artistUrl: js.UndefOr[String] = js.undefined
  
  var artwork: typings.musickitJs.MusicKit.Artwork
  
  var contentRating: js.UndefOr[typings.musickitJs.MusicKit.ContentRating] = js.undefined
  
  var copyright: js.UndefOr[String] = js.undefined
  
  var editorialNotes: js.UndefOr[typings.musickitJs.MusicKit.EditorialNotes] = js.undefined
  
  var genreNames: js.Array[String]
  
  var isCompilation: Boolean
  
  var isComplete: Boolean
  
  var isMasteredForItunes: Boolean
  
  var isSingle: Boolean
  
  var name: String
  
  var playParams: js.UndefOr[PlayParameters] = js.undefined
  
  var recordLabel: js.UndefOr[String] = js.undefined
  
  var releaseDate: js.UndefOr[String] = js.undefined
  
  var trackCount: Double
  
  var upc: js.UndefOr[String] = js.undefined
  
  var url: String
}
object ArtistUrl {
  
  inline def apply(
    artistName: String,
    artwork: typings.musickitJs.MusicKit.Artwork,
    genreNames: js.Array[String],
    isCompilation: Boolean,
    isComplete: Boolean,
    isMasteredForItunes: Boolean,
    isSingle: Boolean,
    name: String,
    trackCount: Double,
    url: String
  ): ArtistUrl = {
    val __obj = js.Dynamic.literal(artistName = artistName.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], isCompilation = isCompilation.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isMasteredForItunes = isMasteredForItunes.asInstanceOf[js.Any], isSingle = isSingle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trackCount = trackCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtistUrl] (val x: Self) extends AnyVal {
    
    inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    inline def setArtistUrl(value: String): Self = StObject.set(x, "artistUrl", value.asInstanceOf[js.Any])
    
    inline def setArtistUrlUndefined: Self = StObject.set(x, "artistUrl", js.undefined)
    
    inline def setArtwork(value: typings.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setContentRating(value: typings.musickitJs.MusicKit.ContentRating): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingNull: Self = StObject.set(x, "contentRating", null)
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setEditorialNotes(value: typings.musickitJs.MusicKit.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
    
    inline def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
    
    inline def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value*))
    
    inline def setIsCompilation(value: Boolean): Self = StObject.set(x, "isCompilation", value.asInstanceOf[js.Any])
    
    inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    
    inline def setIsMasteredForItunes(value: Boolean): Self = StObject.set(x, "isMasteredForItunes", value.asInstanceOf[js.Any])
    
    inline def setIsSingle(value: Boolean): Self = StObject.set(x, "isSingle", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
    
    inline def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
    
    inline def setPossible(value: typings.musickitJs.MusicKit.ContentRating): Self = StObject.set(x, "Possible", value.asInstanceOf[js.Any])
    
    inline def setPossibleNull: Self = StObject.set(x, "Possible", null)
    
    inline def setPossibleUndefined: Self = StObject.set(x, "Possible", js.undefined)
    
    inline def setRecordLabel(value: String): Self = StObject.set(x, "recordLabel", value.asInstanceOf[js.Any])
    
    inline def setRecordLabelUndefined: Self = StObject.set(x, "recordLabel", js.undefined)
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setTrackCount(value: Double): Self = StObject.set(x, "trackCount", value.asInstanceOf[js.Any])
    
    inline def setUpc(value: String): Self = StObject.set(x, "upc", value.asInstanceOf[js.Any])
    
    inline def setUpcUndefined: Self = StObject.set(x, "upc", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
