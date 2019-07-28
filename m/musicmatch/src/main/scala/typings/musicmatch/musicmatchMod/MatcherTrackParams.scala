package typings.musicmatch.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherTrackParams extends MatcherLyricsParams {
  var f_has_lyrics: js.UndefOr[TBoolean] = js.undefined
  var f_has_subtitle: js.UndefOr[TBoolean] = js.undefined
}

object MatcherTrackParams {
  @scala.inline
  def apply(
    f_has_lyrics: TBoolean = null,
    f_has_subtitle: TBoolean = null,
    q_artist: String = null,
    q_track: String = null
  ): MatcherTrackParams = {
    val __obj = js.Dynamic.literal()
    if (f_has_lyrics != null) __obj.updateDynamic("f_has_lyrics")(f_has_lyrics)
    if (f_has_subtitle != null) __obj.updateDynamic("f_has_subtitle")(f_has_subtitle)
    if (q_artist != null) __obj.updateDynamic("q_artist")(q_artist)
    if (q_track != null) __obj.updateDynamic("q_track")(q_track)
    __obj.asInstanceOf[MatcherTrackParams]
  }
}

