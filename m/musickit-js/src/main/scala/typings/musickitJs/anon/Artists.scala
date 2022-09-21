package typings.musickitJs.anon

import typings.musickitJs.MusicKit.LibraryAlbums
import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.RecordLabels
import typings.musickitJs.MusicKit.Relationship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artists extends StObject {
  
  var artists: Relationship[typings.musickitJs.MusicKit.Artists]
  
  var genres: Relationship[typings.musickitJs.MusicKit.Genres]
  
  var library: Relationship[LibraryAlbums]
  
  var `record-labels`: Relationship[RecordLabels]
  
  var tracks: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]
}
object Artists {
  
  inline def apply(
    artists: Relationship[typings.musickitJs.MusicKit.Artists],
    genres: Relationship[typings.musickitJs.MusicKit.Genres],
    library: Relationship[LibraryAlbums],
    `record-labels`: Relationship[RecordLabels],
    tracks: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]
  ): Artists = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.updateDynamic("record-labels")(`record-labels`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artists]
  }
  
  extension [Self <: Artists](x: Self) {
    
    inline def setArtists(value: Relationship[typings.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: Relationship[typings.musickitJs.MusicKit.Genres]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: Relationship[LibraryAlbums]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def `setRecord-labels`(value: Relationship[RecordLabels]): Self = StObject.set(x, "record-labels", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
