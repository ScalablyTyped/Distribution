package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherTrackParams extends MatcherLyricsParams {
  var f_has_lyrics: js.UndefOr[TBoolean] = js.native
  var f_has_subtitle: js.UndefOr[TBoolean] = js.native
}

object MatcherTrackParams {
  @scala.inline
  def apply(): MatcherTrackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherTrackParams]
  }
  @scala.inline
  implicit class MatcherTrackParamsOps[Self <: MatcherTrackParams] (val x: Self) extends AnyVal {
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
    def setF_has_lyrics(value: TBoolean): Self = this.set("f_has_lyrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF_has_lyrics: Self = this.set("f_has_lyrics", js.undefined)
    @scala.inline
    def setF_has_subtitle(value: TBoolean): Self = this.set("f_has_subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF_has_subtitle: Self = this.set("f_has_subtitle", js.undefined)
  }
  
}

