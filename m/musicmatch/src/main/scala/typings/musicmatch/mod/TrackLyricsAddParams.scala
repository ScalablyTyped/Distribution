package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackLyricsAddParams extends js.Object {
  var lyrics_body: js.UndefOr[String] = js.native
  var lyrics_id: js.UndefOr[Double] = js.native
}

object TrackLyricsAddParams {
  @scala.inline
  def apply(): TrackLyricsAddParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackLyricsAddParams]
  }
  @scala.inline
  implicit class TrackLyricsAddParamsOps[Self <: TrackLyricsAddParams] (val x: Self) extends AnyVal {
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
    def setLyrics_body(value: String): Self = this.set("lyrics_body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLyrics_body: Self = this.set("lyrics_body", js.undefined)
    @scala.inline
    def setLyrics_id(value: Double): Self = this.set("lyrics_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLyrics_id: Self = this.set("lyrics_id", js.undefined)
  }
  
}

