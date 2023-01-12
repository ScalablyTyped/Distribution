package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatcherSubtitleParams
  extends StObject
     with MatcherLyricsParams {
  
  var f_subtitle_length: js.UndefOr[Double] = js.undefined
  
  var f_subtitle_length_max_deviation: js.UndefOr[Double] = js.undefined
}
object MatcherSubtitleParams {
  
  inline def apply(): MatcherSubtitleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherSubtitleParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatcherSubtitleParams] (val x: Self) extends AnyVal {
    
    inline def setF_subtitle_length(value: Double): Self = StObject.set(x, "f_subtitle_length", value.asInstanceOf[js.Any])
    
    inline def setF_subtitle_lengthUndefined: Self = StObject.set(x, "f_subtitle_length", js.undefined)
    
    inline def setF_subtitle_length_max_deviation(value: Double): Self = StObject.set(x, "f_subtitle_length_max_deviation", value.asInstanceOf[js.Any])
    
    inline def setF_subtitle_length_max_deviationUndefined: Self = StObject.set(x, "f_subtitle_length_max_deviation", js.undefined)
  }
}
