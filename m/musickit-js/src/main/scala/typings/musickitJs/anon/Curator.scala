package typings.musickitJs.anon

import typings.musickitJs.MusicKit.AppleCurators
import typings.musickitJs.MusicKit.Curators
import typings.musickitJs.MusicKit.LibraryPlaylists
import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.Relationship
import typings.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Curator extends StObject {
  
  var curator: Relationship[typings.musickitJs.MusicKit.Activities | AppleCurators | Curators]
  
  var library: Relationship[LibraryPlaylists]
  
  var tracks: Relationship[MusicVideos | Songs]
}
object Curator {
  
  inline def apply(
    curator: Relationship[typings.musickitJs.MusicKit.Activities | AppleCurators | Curators],
    library: Relationship[LibraryPlaylists],
    tracks: Relationship[MusicVideos | Songs]
  ): Curator = {
    val __obj = js.Dynamic.literal(curator = curator.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Curator] (val x: Self) extends AnyVal {
    
    inline def setCurator(value: Relationship[typings.musickitJs.MusicKit.Activities | AppleCurators | Curators]): Self = StObject.set(x, "curator", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: Relationship[LibraryPlaylists]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
