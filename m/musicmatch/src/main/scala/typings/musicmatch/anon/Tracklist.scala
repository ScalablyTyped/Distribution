package typings.musicmatch.anon

import typings.musicmatch.mod.TrackResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracklist extends js.Object {
  var track_list: js.Array[TrackResult] = js.native
}

object Tracklist {
  @scala.inline
  def apply(track_list: js.Array[TrackResult]): Tracklist = {
    val __obj = js.Dynamic.literal(track_list = track_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracklist]
  }
  @scala.inline
  implicit class TracklistOps[Self <: Tracklist] (val x: Self) extends AnyVal {
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
    def setTrack_listVarargs(value: TrackResult*): Self = this.set("track_list", js.Array(value :_*))
    @scala.inline
    def setTrack_list(value: js.Array[TrackResult]): Self = this.set("track_list", value.asInstanceOf[js.Any])
  }
  
}

