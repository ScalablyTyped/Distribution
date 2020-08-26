package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackSnippetParams extends js.Object {
  var track_id: Double = js.native
}

object TrackSnippetParams {
  @scala.inline
  def apply(track_id: Double): TrackSnippetParams = {
    val __obj = js.Dynamic.literal(track_id = track_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSnippetParams]
  }
  @scala.inline
  implicit class TrackSnippetParamsOps[Self <: TrackSnippetParams] (val x: Self) extends AnyVal {
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
    def setTrack_id(value: Double): Self = this.set("track_id", value.asInstanceOf[js.Any])
  }
  
}

