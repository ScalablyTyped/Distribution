package typings.musickitJs.anon

import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.SearchChartResult
import typings.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in musickit-js.MusicKit.MusicCatalogChartRequestable ]: std.Array<musickit-js.MusicKit.SearchChartResult<key extends 'albums'? musickit-js.MusicKit.Albums : key extends 'music-videos'? musickit-js.MusicKit.MusicVideos : key extends 'playlists'? musickit-js.MusicKit.Playlists : key extends 'songs'? musickit-js.MusicKit.Songs : never>>} */
trait keyinMusicCatalogChartReq extends StObject {
  
  var albums: js.Array[
    SearchChartResult[
      Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
    ]
  ]
  
  var `music-videos`: js.Array[
    SearchChartResult[
      Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
    ]
  ]
  
  var playlists: js.Array[
    SearchChartResult[
      Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
    ]
  ]
  
  var songs: js.Array[
    SearchChartResult[
      Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
    ]
  ]
}
object keyinMusicCatalogChartReq {
  
  inline def apply(
    albums: js.Array[
      SearchChartResult[
        Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
      ]
    ],
    `music-videos`: js.Array[
      SearchChartResult[
        Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
      ]
    ],
    playlists: js.Array[
      SearchChartResult[
        Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
      ]
    ],
    songs: js.Array[
      SearchChartResult[
        Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
      ]
    ]
  ): keyinMusicCatalogChartReq = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], playlists = playlists.asInstanceOf[js.Any], songs = songs.asInstanceOf[js.Any])
    __obj.updateDynamic("music-videos")(`music-videos`.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinMusicCatalogChartReq]
  }
  
  extension [Self <: keyinMusicCatalogChartReq](x: Self) {
    
    inline def setAlbums(
      value: js.Array[
          SearchChartResult[
            Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
          ]
        ]
    ): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setAlbumsVarargs(
      value: (SearchChartResult[
          Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
        ])*
    ): Self = StObject.set(x, "albums", js.Array(value*))
    
    inline def `setMusic-videos`(
      value: js.Array[
          SearchChartResult[
            Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
          ]
        ]
    ): Self = StObject.set(x, "music-videos", value.asInstanceOf[js.Any])
    
    inline def `setMusic-videosVarargs`(
      value: (SearchChartResult[
          Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
        ])*
    ): Self = StObject.set(x, "music-videos", js.Array(value*))
    
    inline def setPlaylists(
      value: js.Array[
          SearchChartResult[
            Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
          ]
        ]
    ): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsVarargs(
      value: (SearchChartResult[
          Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
        ])*
    ): Self = StObject.set(x, "playlists", js.Array(value*))
    
    inline def setSongs(
      value: js.Array[
          SearchChartResult[
            Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
          ]
        ]
    ): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
    
    inline def setSongsVarargs(
      value: (SearchChartResult[
          Songs | typings.musickitJs.MusicKit.Playlists | MusicVideos | typings.musickitJs.MusicKit.Albums
        ])*
    ): Self = StObject.set(x, "songs", js.Array(value*))
  }
}
