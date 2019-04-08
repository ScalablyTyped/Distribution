package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackLyricsFeedbackParams extends js.Object {
  var feedback: js.UndefOr[
    musicmatchLib.musicmatchLibStrings.wrong_lyrics | musicmatchLib.musicmatchLibStrings.wrong_attribution | musicmatchLib.musicmatchLibStrings.bad_characters | musicmatchLib.musicmatchLibStrings.lines_too_long | musicmatchLib.musicmatchLibStrings.wrong_verses | musicmatchLib.musicmatchLibStrings.wrong_formatting
  ] = js.undefined
  var lyrics_id: js.UndefOr[scala.Double] = js.undefined
  var track_id: js.UndefOr[scala.Double] = js.undefined
}

object TrackLyricsFeedbackParams {
  @scala.inline
  def apply(
    feedback: musicmatchLib.musicmatchLibStrings.wrong_lyrics | musicmatchLib.musicmatchLibStrings.wrong_attribution | musicmatchLib.musicmatchLibStrings.bad_characters | musicmatchLib.musicmatchLibStrings.lines_too_long | musicmatchLib.musicmatchLibStrings.wrong_verses | musicmatchLib.musicmatchLibStrings.wrong_formatting = null,
    lyrics_id: scala.Int | scala.Double = null,
    track_id: scala.Int | scala.Double = null
  ): TrackLyricsFeedbackParams = {
    val __obj = js.Dynamic.literal()
    if (feedback != null) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    if (lyrics_id != null) __obj.updateDynamic("lyrics_id")(lyrics_id.asInstanceOf[js.Any])
    if (track_id != null) __obj.updateDynamic("track_id")(track_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackLyricsFeedbackParams]
  }
}

