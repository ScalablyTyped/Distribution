package typings.musickitJs.anon

import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.SearchChartResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Songs extends StObject {
  
  var albums: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Albums]]
  
  var `music-videos`: js.Array[SearchChartResult[MusicVideos]]
  
  var playlists: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Playlists]]
  
  var songs: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Songs]]
}
object Songs {
  
  inline def apply(
    albums: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Albums]],
    `music-videos`: js.Array[SearchChartResult[MusicVideos]],
    playlists: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Playlists]],
    songs: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Songs]]
  ): Songs = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], playlists = playlists.asInstanceOf[js.Any], songs = songs.asInstanceOf[js.Any])
    __obj.updateDynamic("music-videos")(`music-videos`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Songs]
  }
  
  extension [Self <: Songs](x: Self) {
    
    inline def setAlbums(value: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Albums]]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setAlbumsVarargs(value: SearchChartResult[typings.musickitJs.MusicKit.Albums]*): Self = StObject.set(x, "albums", js.Array(value*))
    
    inline def `setMusic-videos`(value: js.Array[SearchChartResult[MusicVideos]]): Self = StObject.set(x, "music-videos", value.asInstanceOf[js.Any])
    
    inline def `setMusic-videosVarargs`(value: SearchChartResult[MusicVideos]*): Self = StObject.set(x, "music-videos", js.Array(value*))
    
    inline def setPlaylists(value: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Playlists]]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsVarargs(value: SearchChartResult[typings.musickitJs.MusicKit.Playlists]*): Self = StObject.set(x, "playlists", js.Array(value*))
    
    inline def setSongs(value: js.Array[SearchChartResult[typings.musickitJs.MusicKit.Songs]]): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
    
    inline def setSongsVarargs(value: SearchChartResult[typings.musickitJs.MusicKit.Songs]*): Self = StObject.set(x, "songs", js.Array(value*))
  }
}
