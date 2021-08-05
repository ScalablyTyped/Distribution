package typings.musicmatch.mod

import typings.musicmatch.musicmatchStrings.dfxp
import typings.musicmatch.musicmatchStrings.lrc
import typings.musicmatch.musicmatchStrings.stledu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackSubtitleParams extends StObject {
  
  var f_subtitle_length: js.UndefOr[Double] = js.undefined
  
  var f_subtitle_length_max_deviation: js.UndefOr[Double] = js.undefined
  
  var subtitle_format: js.UndefOr[lrc | dfxp | stledu] = js.undefined
  
  var track_id: js.UndefOr[Double] = js.undefined
  
  var track_mbid: js.UndefOr[Double] = js.undefined
}
object TrackSubtitleParams {
  
  inline def apply(): TrackSubtitleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSubtitleParams]
  }
  
  extension [Self <: TrackSubtitleParams](x: Self) {
    
    inline def setF_subtitle_length(value: Double): Self = StObject.set(x, "f_subtitle_length", value.asInstanceOf[js.Any])
    
    inline def setF_subtitle_lengthUndefined: Self = StObject.set(x, "f_subtitle_length", js.undefined)
    
    inline def setF_subtitle_length_max_deviation(value: Double): Self = StObject.set(x, "f_subtitle_length_max_deviation", value.asInstanceOf[js.Any])
    
    inline def setF_subtitle_length_max_deviationUndefined: Self = StObject.set(x, "f_subtitle_length_max_deviation", js.undefined)
    
    inline def setSubtitle_format(value: lrc | dfxp | stledu): Self = StObject.set(x, "subtitle_format", value.asInstanceOf[js.Any])
    
    inline def setSubtitle_formatUndefined: Self = StObject.set(x, "subtitle_format", js.undefined)
    
    inline def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
    
    inline def setTrack_idUndefined: Self = StObject.set(x, "track_id", js.undefined)
    
    inline def setTrack_mbid(value: Double): Self = StObject.set(x, "track_mbid", value.asInstanceOf[js.Any])
    
    inline def setTrack_mbidUndefined: Self = StObject.set(x, "track_mbid", js.undefined)
  }
}
