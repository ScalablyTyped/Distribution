package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackLyricsAddParams extends StObject {
  
  var lyrics_body: js.UndefOr[String] = js.undefined
  
  var lyrics_id: js.UndefOr[Double] = js.undefined
}
object TrackLyricsAddParams {
  
  inline def apply(): TrackLyricsAddParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackLyricsAddParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackLyricsAddParams] (val x: Self) extends AnyVal {
    
    inline def setLyrics_body(value: String): Self = StObject.set(x, "lyrics_body", value.asInstanceOf[js.Any])
    
    inline def setLyrics_bodyUndefined: Self = StObject.set(x, "lyrics_body", js.undefined)
    
    inline def setLyrics_id(value: Double): Self = StObject.set(x, "lyrics_id", value.asInstanceOf[js.Any])
    
    inline def setLyrics_idUndefined: Self = StObject.set(x, "lyrics_id", js.undefined)
  }
}
