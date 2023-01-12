package typings.musickitJs.anon

import typings.musickitJs.MusicKit.SearchChartResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in musickit-js.MusicKit.MusicCatalogChartRequestable ]: std.Array<musickit-js.MusicKit.SearchChartResult<key extends 'albums'? musickit-js.MusicKit.Albums : key extends 'music-videos'? musickit-js.MusicKit.MusicVideos : key extends 'playlists'? musickit-js.MusicKit.Playlists : key extends 'songs'? musickit-js.MusicKit.Songs : never>>} */
trait keyinMusicCatalogChartReq extends StObject {
  
  var albums: js.Array[
    SearchChartResult[
      /* import warning: importer.ImportType#apply Failed type conversion: 'albums' extends 'albums' ? musickit-js.MusicKit.Albums : 'albums' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'albums' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'albums' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
    ]
  ]
  
  var `music-videos`: js.Array[
    SearchChartResult[
      /* import warning: importer.ImportType#apply Failed type conversion: 'music-videos' extends 'albums' ? musickit-js.MusicKit.Albums : 'music-videos' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'music-videos' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'music-videos' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
    ]
  ]
  
  var playlists: js.Array[
    SearchChartResult[
      /* import warning: importer.ImportType#apply Failed type conversion: 'playlists' extends 'albums' ? musickit-js.MusicKit.Albums : 'playlists' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'playlists' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'playlists' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
    ]
  ]
  
  var songs: js.Array[
    SearchChartResult[
      /* import warning: importer.ImportType#apply Failed type conversion: 'songs' extends 'albums' ? musickit-js.MusicKit.Albums : 'songs' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'songs' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'songs' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
    ]
  ]
}
object keyinMusicCatalogChartReq {
  
  inline def apply(
    albums: js.Array[
      SearchChartResult[
        /* import warning: importer.ImportType#apply Failed type conversion: 'albums' extends 'albums' ? musickit-js.MusicKit.Albums : 'albums' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'albums' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'albums' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
      ]
    ],
    `music-videos`: js.Array[
      SearchChartResult[
        /* import warning: importer.ImportType#apply Failed type conversion: 'music-videos' extends 'albums' ? musickit-js.MusicKit.Albums : 'music-videos' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'music-videos' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'music-videos' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
      ]
    ],
    playlists: js.Array[
      SearchChartResult[
        /* import warning: importer.ImportType#apply Failed type conversion: 'playlists' extends 'albums' ? musickit-js.MusicKit.Albums : 'playlists' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'playlists' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'playlists' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
      ]
    ],
    songs: js.Array[
      SearchChartResult[
        /* import warning: importer.ImportType#apply Failed type conversion: 'songs' extends 'albums' ? musickit-js.MusicKit.Albums : 'songs' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'songs' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'songs' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
      ]
    ]
  ): keyinMusicCatalogChartReq = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], playlists = playlists.asInstanceOf[js.Any], songs = songs.asInstanceOf[js.Any])
    __obj.updateDynamic("music-videos")(`music-videos`.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinMusicCatalogChartReq]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinMusicCatalogChartReq] (val x: Self) extends AnyVal {
    
    inline def setAlbums(
      value: js.Array[
          SearchChartResult[
            /* import warning: importer.ImportType#apply Failed type conversion: 'albums' extends 'albums' ? musickit-js.MusicKit.Albums : 'albums' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'albums' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'albums' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setAlbumsVarargs(
      value: (SearchChartResult[
          /* import warning: importer.ImportType#apply Failed type conversion: 'albums' extends 'albums' ? musickit-js.MusicKit.Albums : 'albums' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'albums' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'albums' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
        ])*
    ): Self = StObject.set(x, "albums", js.Array(value*))
    
    inline def `setMusic-videos`(
      value: js.Array[
          SearchChartResult[
            /* import warning: importer.ImportType#apply Failed type conversion: 'music-videos' extends 'albums' ? musickit-js.MusicKit.Albums : 'music-videos' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'music-videos' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'music-videos' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "music-videos", value.asInstanceOf[js.Any])
    
    inline def `setMusic-videosVarargs`(
      value: (SearchChartResult[
          /* import warning: importer.ImportType#apply Failed type conversion: 'music-videos' extends 'albums' ? musickit-js.MusicKit.Albums : 'music-videos' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'music-videos' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'music-videos' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
        ])*
    ): Self = StObject.set(x, "music-videos", js.Array(value*))
    
    inline def setPlaylists(
      value: js.Array[
          SearchChartResult[
            /* import warning: importer.ImportType#apply Failed type conversion: 'playlists' extends 'albums' ? musickit-js.MusicKit.Albums : 'playlists' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'playlists' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'playlists' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsVarargs(
      value: (SearchChartResult[
          /* import warning: importer.ImportType#apply Failed type conversion: 'playlists' extends 'albums' ? musickit-js.MusicKit.Albums : 'playlists' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'playlists' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'playlists' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
        ])*
    ): Self = StObject.set(x, "playlists", js.Array(value*))
    
    inline def setSongs(
      value: js.Array[
          SearchChartResult[
            /* import warning: importer.ImportType#apply Failed type conversion: 'songs' extends 'albums' ? musickit-js.MusicKit.Albums : 'songs' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'songs' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'songs' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
    
    inline def setSongsVarargs(
      value: (SearchChartResult[
          /* import warning: importer.ImportType#apply Failed type conversion: 'songs' extends 'albums' ? musickit-js.MusicKit.Albums : 'songs' extends 'music-videos' ? musickit-js.MusicKit.MusicVideos : 'songs' extends 'playlists' ? musickit-js.MusicKit.Playlists : 'songs' extends 'songs' ? musickit-js.MusicKit.Songs : never */ js.Any
        ])*
    ): Self = StObject.set(x, "songs", js.Array(value*))
  }
}
