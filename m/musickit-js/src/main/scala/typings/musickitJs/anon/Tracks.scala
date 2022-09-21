package typings.musickitJs.anon

import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.Relationship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracks extends StObject {
  
  var catalog: Relationship[typings.musickitJs.MusicKit.Playlists]
  
  var tracks: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]
}
object Tracks {
  
  inline def apply(
    catalog: Relationship[typings.musickitJs.MusicKit.Playlists],
    tracks: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]
  ): Tracks = {
    val __obj = js.Dynamic.literal(catalog = catalog.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracks]
  }
  
  extension [Self <: Tracks](x: Self) {
    
    inline def setCatalog(value: Relationship[typings.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
