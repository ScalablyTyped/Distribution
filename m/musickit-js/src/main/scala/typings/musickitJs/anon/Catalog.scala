package typings.musickitJs.anon

import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.Relationship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Catalog extends StObject {
  
  var artists: Relationship[typings.musickitJs.MusicKit.Artists]
  
  var catalog: Relationship[typings.musickitJs.MusicKit.Playlists]
  
  var tracks: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]
}
object Catalog {
  
  inline def apply(
    artists: Relationship[typings.musickitJs.MusicKit.Artists],
    catalog: Relationship[typings.musickitJs.MusicKit.Playlists],
    tracks: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]
  ): Catalog = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], catalog = catalog.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Catalog]
  }
  
  extension [Self <: Catalog](x: Self) {
    
    inline def setArtists(value: Relationship[typings.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setCatalog(value: Relationship[typings.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | typings.musickitJs.MusicKit.Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
