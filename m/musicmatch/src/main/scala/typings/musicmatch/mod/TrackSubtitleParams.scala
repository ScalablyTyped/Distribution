package typings.musicmatch.mod

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
    f_subtitle_length: js.UndefOr[Double] = js.undefined,
    f_subtitle_length_max_deviation: js.UndefOr[Double] = js.undefined,
    subtitle_format: lrc | dfxp | stledu = null,
    track_id: js.UndefOr[Double] = js.undefined,
    track_mbid: js.UndefOr[Double] = js.undefined
  ): TrackSubtitleParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(f_subtitle_length)) __obj.updateDynamic("f_subtitle_length")(f_subtitle_length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(f_subtitle_length_max_deviation)) __obj.updateDynamic("f_subtitle_length_max_deviation")(f_subtitle_length_max_deviation.get.asInstanceOf[js.Any])
    if (subtitle_format != null) __obj.updateDynamic("subtitle_format")(subtitle_format.asInstanceOf[js.Any])
    if (!js.isUndefined(track_id)) __obj.updateDynamic("track_id")(track_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(track_mbid)) __obj.updateDynamic("track_mbid")(track_mbid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSubtitleParams]
  }
}

