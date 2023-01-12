package typings.musickitJs.anon

import typings.musickitJs.MusicKit.LibraryAlbums
import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.Relationship
import typings.musickitJs.MusicKit.Stations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Albums extends StObject {
  
  var albums: Relationship[typings.musickitJs.MusicKit.Albums]
  
  var artists: Relationship[typings.musickitJs.MusicKit.Artists]
  
  var composers: Relationship[typings.musickitJs.MusicKit.Artists]
  
  var genres: Relationship[typings.musickitJs.MusicKit.Genres]
  
  var library: Relationship[LibraryAlbums]
  
  var `music-videos`: Relationship[MusicVideos]
  
  var station: Relationship[Stations]
}
object Albums {
  
  inline def apply(
    albums: Relationship[typings.musickitJs.MusicKit.Albums],
    artists: Relationship[typings.musickitJs.MusicKit.Artists],
    composers: Relationship[typings.musickitJs.MusicKit.Artists],
    genres: Relationship[typings.musickitJs.MusicKit.Genres],
    library: Relationship[LibraryAlbums],
    `music-videos`: Relationship[MusicVideos],
    station: Relationship[Stations]
  ): Albums = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], composers = composers.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], station = station.asInstanceOf[js.Any])
    __obj.updateDynamic("music-videos")(`music-videos`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Albums]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Albums] (val x: Self) extends AnyVal {
    
    inline def setAlbums(value: Relationship[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setArtists(value: Relationship[typings.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setComposers(value: Relationship[typings.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "composers", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: Relationship[typings.musickitJs.MusicKit.Genres]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: Relationship[LibraryAlbums]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def `setMusic-videos`(value: Relationship[MusicVideos]): Self = StObject.set(x, "music-videos", value.asInstanceOf[js.Any])
    
    inline def setStation(value: Relationship[Stations]): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
  }
}
