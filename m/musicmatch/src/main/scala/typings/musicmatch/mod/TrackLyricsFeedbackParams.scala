package typings.musicmatch.mod

import typings.musicmatch.musicmatchStrings.bad_characters
import typings.musicmatch.musicmatchStrings.lines_too_long
import typings.musicmatch.musicmatchStrings.wrong_attribution
import typings.musicmatch.musicmatchStrings.wrong_formatting
import typings.musicmatch.musicmatchStrings.wrong_lyrics
import typings.musicmatch.musicmatchStrings.wrong_verses
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackLyricsFeedbackParams extends js.Object {
  var feedback: js.UndefOr[
    wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
  ] = js.undefined
  var lyrics_id: js.UndefOr[Double] = js.undefined
  var track_id: js.UndefOr[Double] = js.undefined
}

object TrackLyricsFeedbackParams {
  @scala.inline
  def apply(
    feedback: wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting = null,
    lyrics_id: js.UndefOr[Double] = js.undefined,
    track_id: js.UndefOr[Double] = js.undefined
  ): TrackLyricsFeedbackParams = {
    val __obj = js.Dynamic.literal()
    if (feedback != null) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    if (!js.isUndefined(lyrics_id)) __obj.updateDynamic("lyrics_id")(lyrics_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(track_id)) __obj.updateDynamic("track_id")(track_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackLyricsFeedbackParams]
  }
}

