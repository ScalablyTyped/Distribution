package typings.musickitJs.anon

import typings.musickitJs.MusicKit.AppleCurators
import typings.musickitJs.MusicKit.Curators
import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.RecordLabels
import typings.musickitJs.MusicKit.SearchResult
import typings.musickitJs.MusicKit.Songs
import typings.musickitJs.MusicKit.Stations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activities extends StObject {
  
  var activities: js.UndefOr[SearchResult[typings.musickitJs.MusicKit.Activities]] = js.undefined
  
  var albums: js.UndefOr[SearchResult[typings.musickitJs.MusicKit.Albums]] = js.undefined
  
  var `apple-curators`: js.UndefOr[SearchResult[AppleCurators]] = js.undefined
  
  var artists: js.UndefOr[SearchResult[typings.musickitJs.MusicKit.Artists]] = js.undefined
  
  var curators: js.UndefOr[SearchResult[Curators]] = js.undefined
  
  var `music-videos`: js.UndefOr[SearchResult[MusicVideos]] = js.undefined
  
  var playlists: js.UndefOr[SearchResult[typings.musickitJs.MusicKit.Playlists]] = js.undefined
  
  var `record-labels`: js.UndefOr[SearchResult[RecordLabels]] = js.undefined
  
  var songs: js.UndefOr[SearchResult[Songs]] = js.undefined
  
  var stations: js.UndefOr[SearchResult[Stations]] = js.undefined
  
  var top: js.UndefOr[DataArray] = js.undefined
}
object Activities {
  
  inline def apply(): Activities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Activities] (val x: Self) extends AnyVal {
    
    inline def setActivities(value: SearchResult[typings.musickitJs.MusicKit.Activities]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setAlbums(value: SearchResult[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setAlbumsUndefined: Self = StObject.set(x, "albums", js.undefined)
    
    inline def `setApple-curators`(value: SearchResult[AppleCurators]): Self = StObject.set(x, "apple-curators", value.asInstanceOf[js.Any])
    
    inline def `setApple-curatorsUndefined`: Self = StObject.set(x, "apple-curators", js.undefined)
    
    inline def setArtists(value: SearchResult[typings.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setArtistsUndefined: Self = StObject.set(x, "artists", js.undefined)
    
    inline def setCurators(value: SearchResult[Curators]): Self = StObject.set(x, "curators", value.asInstanceOf[js.Any])
    
    inline def setCuratorsUndefined: Self = StObject.set(x, "curators", js.undefined)
    
    inline def `setMusic-videos`(value: SearchResult[MusicVideos]): Self = StObject.set(x, "music-videos", value.asInstanceOf[js.Any])
    
    inline def `setMusic-videosUndefined`: Self = StObject.set(x, "music-videos", js.undefined)
    
    inline def setPlaylists(value: SearchResult[typings.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
    
    inline def `setRecord-labels`(value: SearchResult[RecordLabels]): Self = StObject.set(x, "record-labels", value.asInstanceOf[js.Any])
    
    inline def `setRecord-labelsUndefined`: Self = StObject.set(x, "record-labels", js.undefined)
    
    inline def setSongs(value: SearchResult[Songs]): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
    
    inline def setSongsUndefined: Self = StObject.set(x, "songs", js.undefined)
    
    inline def setStations(value: SearchResult[Stations]): Self = StObject.set(x, "stations", value.asInstanceOf[js.Any])
    
    inline def setStationsUndefined: Self = StObject.set(x, "stations", js.undefined)
    
    inline def setTop(value: DataArray): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
