package typings.musickitJs.anon

import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.Relationship
import typings.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Catalog extends StObject {
  
  var artists: Relationship[typings.musickitJs.MusicKit.Artists]
  
  var catalog: Relationship[typings.musickitJs.MusicKit.Playlists]
  
  var tracks: Relationship[MusicVideos | Songs]
}
object Catalog {
  
  inline def apply(
    artists: Relationship[typings.musickitJs.MusicKit.Artists],
    catalog: Relationship[typings.musickitJs.MusicKit.Playlists],
    tracks: Relationship[MusicVideos | Songs]
  ): Catalog = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], catalog = catalog.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Catalog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Catalog] (val x: Self) extends AnyVal {
    
    inline def setArtists(value: Relationship[typings.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setCatalog(value: Relationship[typings.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
