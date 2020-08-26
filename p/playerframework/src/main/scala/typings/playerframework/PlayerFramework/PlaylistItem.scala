package typings.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistItem extends js.Object {
  var src: String = js.native
  var tracks: js.UndefOr[js.Array[_]] = js.native
}

object PlaylistItem {
  @scala.inline
  def apply(src: String): PlaylistItem = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItem]
  }
  @scala.inline
  implicit class PlaylistItemOps[Self <: PlaylistItem] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracksVarargs(value: js.Any*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[_]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
  
}

