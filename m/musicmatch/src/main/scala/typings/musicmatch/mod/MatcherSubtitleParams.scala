package typings.musicmatch.mod

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
    f_subtitle_length: js.UndefOr[Double] = js.undefined,
    f_subtitle_length_max_deviation: js.UndefOr[Double] = js.undefined,
    q_artist: String = null,
    q_track: String = null
  ): MatcherSubtitleParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(f_subtitle_length)) __obj.updateDynamic("f_subtitle_length")(f_subtitle_length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(f_subtitle_length_max_deviation)) __obj.updateDynamic("f_subtitle_length_max_deviation")(f_subtitle_length_max_deviation.get.asInstanceOf[js.Any])
    if (q_artist != null) __obj.updateDynamic("q_artist")(q_artist.asInstanceOf[js.Any])
    if (q_track != null) __obj.updateDynamic("q_track")(q_track.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherSubtitleParams]
  }
}

