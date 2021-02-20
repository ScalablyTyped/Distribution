package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatcherLyricsParams extends StObject {
  
  var q_artist: js.UndefOr[String] = js.native
  
  var q_track: js.UndefOr[String] = js.native
}
object MatcherLyricsParams {
  
  @scala.inline
  def apply(): MatcherLyricsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherLyricsParams]
  }
  
  @scala.inline
  implicit class MatcherLyricsParamsMutableBuilder[Self <: MatcherLyricsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQ_artist(value: String): Self = StObject.set(x, "q_artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ_artistUndefined: Self = StObject.set(x, "q_artist", js.undefined)
    
    @scala.inline
    def setQ_track(value: String): Self = StObject.set(x, "q_track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ_trackUndefined: Self = StObject.set(x, "q_track", js.undefined)
  }
}
