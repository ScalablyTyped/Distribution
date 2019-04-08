package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSubtitleParams extends js.Object {
  var f_subtitle_length: js.UndefOr[scala.Double] = js.undefined
  var f_subtitle_length_max_deviation: js.UndefOr[scala.Double] = js.undefined
  var subtitle_format: js.UndefOr[
    musicmatchLib.musicmatchLibStrings.lrc | musicmatchLib.musicmatchLibStrings.dfxp | musicmatchLib.musicmatchLibStrings.stledu
  ] = js.undefined
  var track_id: js.UndefOr[scala.Double] = js.undefined
  var track_mbid: js.UndefOr[scala.Double] = js.undefined
}

object TrackSubtitleParams {
  @scala.inline
  def apply(
    f_subtitle_length: scala.Int | scala.Double = null,
    f_subtitle_length_max_deviation: scala.Int | scala.Double = null,
    subtitle_format: musicmatchLib.musicmatchLibStrings.lrc | musicmatchLib.musicmatchLibStrings.dfxp | musicmatchLib.musicmatchLibStrings.stledu = null,
    track_id: scala.Int | scala.Double = null,
    track_mbid: scala.Int | scala.Double = null
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

