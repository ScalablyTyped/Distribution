package typings.musickitJs.anon

import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.Relationship
import typings.musickitJs.MusicKit.Stations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Musicvideos extends StObject {
  
  var albums: Relationship[typings.musickitJs.MusicKit.Albums]
  
  var genres: Relationship[typings.musickitJs.MusicKit.Genres]
  
  var `music-videos`: Relationship[MusicVideos]
  
  var playlists: Relationship[typings.musickitJs.MusicKit.Playlists]
  
  var station: Relationship[Stations]
}
object Musicvideos {
  
  inline def apply(
    albums: Relationship[typings.musickitJs.MusicKit.Albums],
    genres: Relationship[typings.musickitJs.MusicKit.Genres],
    `music-videos`: Relationship[MusicVideos],
    playlists: Relationship[typings.musickitJs.MusicKit.Playlists],
    station: Relationship[Stations]
  ): Musicvideos = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], playlists = playlists.asInstanceOf[js.Any], station = station.asInstanceOf[js.Any])
    __obj.updateDynamic("music-videos")(`music-videos`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Musicvideos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Musicvideos] (val x: Self) extends AnyVal {
    
    inline def setAlbums(value: Relationship[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: Relationship[typings.musickitJs.MusicKit.Genres]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def `setMusic-videos`(value: Relationship[MusicVideos]): Self = StObject.set(x, "music-videos", value.asInstanceOf[js.Any])
    
    inline def setPlaylists(value: Relationship[typings.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    inline def setStation(value: Relationship[Stations]): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
  }
}
