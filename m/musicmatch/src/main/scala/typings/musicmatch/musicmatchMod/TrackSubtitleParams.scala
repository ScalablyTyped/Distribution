package typings.musicmatch.musicmatchMod

import typings.musicmatch.musicmatchStrings.dfxp
import typings.musicmatch.musicmatchStrings.lrc
import typings.musicmatch.musicmatchStrings.stledu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSubtitleParams extends js.Object {
  var f_subtitle_length: js.UndefOr[Double] = js.undefined
  var f_subtitle_length_max_deviation: js.UndefOr[Double] = js.undefined
  var subtitle_format: js.UndefOr[lrc | dfxp | stledu] = js.undefined
  var track_id: js.UndefOr[Double] = js.undefined
  var track_mbid: js.UndefOr[Double] = js.undefined
}

object TrackSubtitleParams {
  @scala.inline
  def apply(
    f_subtitle_length: Int | Double = null,
    f_subtitle_length_max_deviation: Int | Double = null,
    subtitle_format: lrc | dfxp | stledu = null,
    track_id: Int | Double = null,
    track_mbid: Int | Double = null
  ): TrackSubtitleParams = {
    val __obj = js.Dynamic.literal()
    if (f_subtitle_length != null) __obj.updateDynamic("f_subtitle_length")(f_subtitle_length.asInstanceOf[js.Any])
    if (f_subtitle_length_max_deviation != null) __obj.updateDynamic("f_subtitle_length_max_deviation")(f_subtitle_length_max_deviation.asInstanceOf[js.Any])
    if (subtitle_format != null) __obj.updateDynamic("subtitle_format")(subtitle_format.asInstanceOf[js.Any])
    if (track_id != null) __obj.updateDynamic("track_id")(track_id.asInstanceOf[js.Any])
    if (track_mbid != null) __obj.updateDynamic("track_mbid")(track_mbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSubtitleParams]
  }
}

