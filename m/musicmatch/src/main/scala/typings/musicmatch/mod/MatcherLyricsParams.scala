package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherLyricsParams extends js.Object {
  var q_artist: js.UndefOr[String] = js.native
  var q_track: js.UndefOr[String] = js.native
}

object MatcherLyricsParams {
  @scala.inline
  def apply(): MatcherLyricsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherLyricsParams]
  }
  @scala.inline
  implicit class MatcherLyricsParamsOps[Self <: MatcherLyricsParams] (val x: Self) extends AnyVal {
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
    def setQ_artist(value: String): Self = this.set("q_artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ_artist: Self = this.set("q_artist", js.undefined)
    @scala.inline
    def setQ_track(value: String): Self = this.set("q_track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ_track: Self = this.set("q_track", js.undefined)
  }
  
}

