package typings.musickitJs.anon

import typings.musickitJs.MusicKit.AppleCurators
import typings.musickitJs.MusicKit.Curators
import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.RecordLabels
import typings.musickitJs.MusicKit.Songs
import typings.musickitJs.MusicKit.Stations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArray extends StObject {
  
  var data: js.Array[
    typings.musickitJs.MusicKit.Activities | typings.musickitJs.MusicKit.Albums | AppleCurators | typings.musickitJs.MusicKit.Artists | Curators | MusicVideos | typings.musickitJs.MusicKit.Playlists | RecordLabels | Songs | Stations
  ]
}
object DataArray {
  
  inline def apply(
    data: js.Array[
      typings.musickitJs.MusicKit.Activities | typings.musickitJs.MusicKit.Albums | AppleCurators | typings.musickitJs.MusicKit.Artists | Curators | MusicVideos | typings.musickitJs.MusicKit.Playlists | RecordLabels | Songs | Stations
    ]
  ): DataArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray]
  }
  
  extension [Self <: DataArray](x: Self) {
    
    inline def setData(
      value: js.Array[
          typings.musickitJs.MusicKit.Activities | typings.musickitJs.MusicKit.Albums | AppleCurators | typings.musickitJs.MusicKit.Artists | Curators | MusicVideos | typings.musickitJs.MusicKit.Playlists | RecordLabels | Songs | Stations
        ]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(
      value: (typings.musickitJs.MusicKit.Activities | typings.musickitJs.MusicKit.Albums | AppleCurators | typings.musickitJs.MusicKit.Artists | Curators | MusicVideos | typings.musickitJs.MusicKit.Playlists | RecordLabels | Songs | Stations)*
    ): Self = StObject.set(x, "data", js.Array(value*))
  }
}
