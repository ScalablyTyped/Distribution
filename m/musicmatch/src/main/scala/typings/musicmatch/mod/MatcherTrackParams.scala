package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatcherTrackParams
  extends StObject
     with MatcherLyricsParams {
  
  var f_has_lyrics: js.UndefOr[TBoolean] = js.undefined
  
  var f_has_subtitle: js.UndefOr[TBoolean] = js.undefined
}
object MatcherTrackParams {
  
  inline def apply(): MatcherTrackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherTrackParams]
  }
  
  extension [Self <: MatcherTrackParams](x: Self) {
    
    inline def setF_has_lyrics(value: TBoolean): Self = StObject.set(x, "f_has_lyrics", value.asInstanceOf[js.Any])
    
    inline def setF_has_lyricsUndefined: Self = StObject.set(x, "f_has_lyrics", js.undefined)
    
    inline def setF_has_subtitle(value: TBoolean): Self = StObject.set(x, "f_has_subtitle", value.asInstanceOf[js.Any])
    
    inline def setF_has_subtitleUndefined: Self = StObject.set(x, "f_has_subtitle", js.undefined)
  }
}
