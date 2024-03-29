package typings.musickitJs.anon

import typings.musickitJs.MusicKit.LibraryAlbums
import typings.musickitJs.MusicKit.Relationship
import typings.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Genres extends StObject {
  
  var albums: Relationship[typings.musickitJs.MusicKit.Albums]
  
  var genres: Relationship[typings.musickitJs.MusicKit.Genres]
  
  var library: Relationship[LibraryAlbums]
  
  var songs: Relationship[Songs]
}
object Genres {
  
  inline def apply(
    albums: Relationship[typings.musickitJs.MusicKit.Albums],
    genres: Relationship[typings.musickitJs.MusicKit.Genres],
    library: Relationship[LibraryAlbums],
    songs: Relationship[Songs]
  ): Genres = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], songs = songs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genres]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Genres] (val x: Self) extends AnyVal {
    
    inline def setAlbums(value: Relationship[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: Relationship[typings.musickitJs.MusicKit.Genres]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: Relationship[LibraryAlbums]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setSongs(value: Relationship[Songs]): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
  }
}
