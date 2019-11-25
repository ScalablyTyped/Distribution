package typings.musicmatch.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherSubtitleParams extends MatcherLyricsParams {
  var f_subtitle_length: js.UndefOr[Double] = js.undefined
  var f_subtitle_length_max_deviation: js.UndefOr[Double] = js.undefined
}

object MatcherSubtitleParams {
  @scala.inline
  def apply(
    f_subtitle_length: Int | Double = null,
    f_subtitle_length_max_deviation: Int | Double = null,
    q_artist: String = null,
    q_track: String = null
  ): MatcherSubtitleParams = {
    val __obj = js.Dynamic.literal()
    if (f_subtitle_length != null) __obj.updateDynamic("f_subtitle_length")(f_subtitle_length.asInstanceOf[js.Any])
    if (f_subtitle_length_max_deviation != null) __obj.updateDynamic("f_subtitle_length_max_deviation")(f_subtitle_length_max_deviation.asInstanceOf[js.Any])
    if (q_artist != null) __obj.updateDynamic("q_artist")(q_artist.asInstanceOf[js.Any])
    if (q_track != null) __obj.updateDynamic("q_track")(q_track.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherSubtitleParams]
  }
}

