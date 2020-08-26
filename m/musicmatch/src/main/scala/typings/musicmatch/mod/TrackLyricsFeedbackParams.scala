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

@js.native
trait TrackLyricsFeedbackParams extends js.Object {
  var feedback: js.UndefOr[
    wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
  ] = js.native
  var lyrics_id: js.UndefOr[Double] = js.native
  var track_id: js.UndefOr[Double] = js.native
}

object TrackLyricsFeedbackParams {
  @scala.inline
  def apply(): TrackLyricsFeedbackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackLyricsFeedbackParams]
  }
  @scala.inline
  implicit class TrackLyricsFeedbackParamsOps[Self <: TrackLyricsFeedbackParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeedback(
      value: wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
    ): Self = this.set("feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
    @scala.inline
    def setLyrics_id(value: Double): Self = this.set("lyrics_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLyrics_id: Self = this.set("lyrics_id", js.undefined)
    @scala.inline
    def setTrack_id(value: Double): Self = this.set("track_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack_id: Self = this.set("track_id", js.undefined)
  }
  
}

