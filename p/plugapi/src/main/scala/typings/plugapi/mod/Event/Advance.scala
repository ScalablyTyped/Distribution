package typings.plugapi.mod.Event

import typings.plugapi.mod.LastPlay
import typings.plugapi.mod.Media
import typings.plugapi.mod.User.DJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advance extends StObject {
  
  var currentDJ: DJ
  
  var djs: js.Array[DJ]
  
  var historyID: String
  
  var lastPlay: LastPlay
  
  var media: Media
  
  var playlistID: Double
  
  var startTime: String
}
object Advance {
  
  inline def apply(
    currentDJ: DJ,
    djs: js.Array[DJ],
    historyID: String,
    lastPlay: LastPlay,
    media: Media,
    playlistID: Double,
    startTime: String
  ): Advance = {
    val __obj = js.Dynamic.literal(currentDJ = currentDJ.asInstanceOf[js.Any], djs = djs.asInstanceOf[js.Any], historyID = historyID.asInstanceOf[js.Any], lastPlay = lastPlay.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], playlistID = playlistID.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advance]
  }
  
  extension [Self <: Advance](x: Self) {
    
    inline def setCurrentDJ(value: DJ): Self = StObject.set(x, "currentDJ", value.asInstanceOf[js.Any])
    
    inline def setDjs(value: js.Array[DJ]): Self = StObject.set(x, "djs", value.asInstanceOf[js.Any])
    
    inline def setDjsVarargs(value: DJ*): Self = StObject.set(x, "djs", js.Array(value :_*))
    
    inline def setHistoryID(value: String): Self = StObject.set(x, "historyID", value.asInstanceOf[js.Any])
    
    inline def setLastPlay(value: LastPlay): Self = StObject.set(x, "lastPlay", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setPlaylistID(value: Double): Self = StObject.set(x, "playlistID", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
