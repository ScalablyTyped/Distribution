package typings.musickitJs.anon

import typings.musickitJs.MusicKit.DescriptionAttribute
import typings.musickitJs.musickitJsStrings.`music-videos`
import typings.musickitJs.musickitJsStrings.`personal-mix`
import typings.musickitJs.musickitJsStrings.`user-shared`
import typings.musickitJs.musickitJsStrings.editorial
import typings.musickitJs.musickitJsStrings.external
import typings.musickitJs.musickitJsStrings.replay
import typings.musickitJs.musickitJsStrings.songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CuratorName extends StObject {
  
  var artwork: js.UndefOr[typings.musickitJs.MusicKit.Artwork] = js.undefined
  
  var curatorName: String
  
  var description: js.UndefOr[DescriptionAttribute] = js.undefined
  
  var isChart: Boolean
  
  var lastModifiedDate: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var playlistType: editorial | external | `personal-mix` | replay | `user-shared`
  
  var trackTypes: js.Array[`music-videos` | songs]
  
  var url: String
}
object CuratorName {
  
  inline def apply(
    curatorName: String,
    isChart: Boolean,
    name: String,
    playlistType: editorial | external | `personal-mix` | replay | `user-shared`,
    trackTypes: js.Array[`music-videos` | songs],
    url: String
  ): CuratorName = {
    val __obj = js.Dynamic.literal(curatorName = curatorName.asInstanceOf[js.Any], isChart = isChart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playlistType = playlistType.asInstanceOf[js.Any], trackTypes = trackTypes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CuratorName]
  }
  
  extension [Self <: CuratorName](x: Self) {
    
    inline def setArtwork(value: typings.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
    
    inline def setCuratorName(value: String): Self = StObject.set(x, "curatorName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: DescriptionAttribute): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsChart(value: Boolean): Self = StObject.set(x, "isChart", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDate(value: String): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlaylistType(value: editorial | external | `personal-mix` | replay | `user-shared`): Self = StObject.set(x, "playlistType", value.asInstanceOf[js.Any])
    
    inline def setTrackTypes(value: js.Array[`music-videos` | songs]): Self = StObject.set(x, "trackTypes", value.asInstanceOf[js.Any])
    
    inline def setTrackTypesVarargs(value: (`music-videos` | songs)*): Self = StObject.set(x, "trackTypes", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
