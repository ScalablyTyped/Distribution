package typings.musickitJs.anon

import typings.musickitJs.MusicKit.PlayParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateAdded extends StObject {
  
  var artistName: String
  
  var artwork: typings.musickitJs.MusicKit.Artwork
  
  var contentRating: js.UndefOr[typings.musickitJs.MusicKit.ContentRating] = js.undefined
  
  var dateAdded: js.UndefOr[String] = js.undefined
  
  var genreNames: js.Array[String]
  
  var name: String
  
  var playParams: js.UndefOr[PlayParameters] = js.undefined
  
  var releaseDate: js.UndefOr[String] = js.undefined
  
  var trackCount: Double
}
object DateAdded {
  
  inline def apply(
    artistName: String,
    artwork: typings.musickitJs.MusicKit.Artwork,
    genreNames: js.Array[String],
    name: String,
    trackCount: Double
  ): DateAdded = {
    val __obj = js.Dynamic.literal(artistName = artistName.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trackCount = trackCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateAdded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateAdded] (val x: Self) extends AnyVal {
    
    inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    inline def setArtwork(value: typings.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setContentRating(value: typings.musickitJs.MusicKit.ContentRating): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingNull: Self = StObject.set(x, "contentRating", null)
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setDateAdded(value: String): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
    
    inline def setDateAddedUndefined: Self = StObject.set(x, "dateAdded", js.undefined)
    
    inline def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
    
    inline def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
    
    inline def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setTrackCount(value: Double): Self = StObject.set(x, "trackCount", value.asInstanceOf[js.Any])
  }
}
