package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackLyricsParams extends StObject {
  
  var track_id: js.UndefOr[Double] = js.undefined
  
  var track_mbid: js.UndefOr[Double] = js.undefined
}
object TrackLyricsParams {
  
  @scala.inline
  def apply(): TrackLyricsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackLyricsParams]
  }
  
  @scala.inline
  implicit class TrackLyricsParamsMutableBuilder[Self <: TrackLyricsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_idUndefined: Self = StObject.set(x, "track_id", js.undefined)
    
    @scala.inline
    def setTrack_mbid(value: Double): Self = StObject.set(x, "track_mbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_mbidUndefined: Self = StObject.set(x, "track_mbid", js.undefined)
  }
}
