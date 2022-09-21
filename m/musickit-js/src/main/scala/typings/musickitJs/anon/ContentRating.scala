package typings.musickitJs.anon

import typings.musickitJs.MusicKit.PlayParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentRating extends StObject {
  
  var artwork: typings.musickitJs.MusicKit.Artwork
  
  var contentRating: js.UndefOr[typings.musickitJs.MusicKit.ContentRating] = js.undefined
  
  var durationInMillis: Double
  
  var editorialNotes: typings.musickitJs.MusicKit.EditorialNotes
  
  var episodeNumber: Double
  
  var isLive: Boolean
  
  var name: String
  
  var playParams: PlayParameters
  
  var stationProviderName: String
  
  var url: String
}
object ContentRating {
  
  inline def apply(
    artwork: typings.musickitJs.MusicKit.Artwork,
    durationInMillis: Double,
    editorialNotes: typings.musickitJs.MusicKit.EditorialNotes,
    episodeNumber: Double,
    isLive: Boolean,
    name: String,
    playParams: PlayParameters,
    stationProviderName: String,
    url: String
  ): ContentRating = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], durationInMillis = durationInMillis.asInstanceOf[js.Any], editorialNotes = editorialNotes.asInstanceOf[js.Any], episodeNumber = episodeNumber.asInstanceOf[js.Any], isLive = isLive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playParams = playParams.asInstanceOf[js.Any], stationProviderName = stationProviderName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRating]
  }
  
  extension [Self <: ContentRating](x: Self) {
    
    inline def setArtwork(value: typings.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setContentRating(value: typings.musickitJs.MusicKit.ContentRating): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingNull: Self = StObject.set(x, "contentRating", null)
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setDurationInMillis(value: Double): Self = StObject.set(x, "durationInMillis", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotes(value: typings.musickitJs.MusicKit.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
    
    inline def setEpisodeNumber(value: Double): Self = StObject.set(x, "episodeNumber", value.asInstanceOf[js.Any])
    
    inline def setIsLive(value: Boolean): Self = StObject.set(x, "isLive", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
    
    inline def setStationProviderName(value: String): Self = StObject.set(x, "stationProviderName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
