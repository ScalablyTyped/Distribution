package typings.musicmatch.mod

import typings.musicmatch.musicmatchStrings.bad_characters
import typings.musicmatch.musicmatchStrings.lines_too_long
import typings.musicmatch.musicmatchStrings.wrong_attribution
import typings.musicmatch.musicmatchStrings.wrong_formatting
import typings.musicmatch.musicmatchStrings.wrong_lyrics
import typings.musicmatch.musicmatchStrings.wrong_verses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackLyricsFeedbackParams extends StObject {
  
  var feedback: js.UndefOr[
    wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
  ] = js.undefined
  
  var lyrics_id: js.UndefOr[Double] = js.undefined
  
  var track_id: js.UndefOr[Double] = js.undefined
}
object TrackLyricsFeedbackParams {
  
  inline def apply(): TrackLyricsFeedbackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackLyricsFeedbackParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackLyricsFeedbackParams] (val x: Self) extends AnyVal {
    
    inline def setFeedback(
      value: wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
    ): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setLyrics_id(value: Double): Self = StObject.set(x, "lyrics_id", value.asInstanceOf[js.Any])
    
    inline def setLyrics_idUndefined: Self = StObject.set(x, "lyrics_id", js.undefined)
    
    inline def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
    
    inline def setTrack_idUndefined: Self = StObject.set(x, "track_id", js.undefined)
  }
}
