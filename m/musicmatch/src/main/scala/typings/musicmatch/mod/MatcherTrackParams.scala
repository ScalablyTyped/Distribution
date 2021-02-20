package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatcherTrackParams extends MatcherLyricsParams {
  
  var f_has_lyrics: js.UndefOr[TBoolean] = js.native
  
  var f_has_subtitle: js.UndefOr[TBoolean] = js.native
}
object MatcherTrackParams {
  
  @scala.inline
  def apply(): MatcherTrackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherTrackParams]
  }
  
  @scala.inline
  implicit class MatcherTrackParamsMutableBuilder[Self <: MatcherTrackParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setF_has_lyrics(value: TBoolean): Self = StObject.set(x, "f_has_lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_has_lyricsUndefined: Self = StObject.set(x, "f_has_lyrics", js.undefined)
    
    @scala.inline
    def setF_has_subtitle(value: TBoolean): Self = StObject.set(x, "f_has_subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_has_subtitleUndefined: Self = StObject.set(x, "f_has_subtitle", js.undefined)
  }
}
