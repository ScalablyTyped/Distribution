package typings.plugapi.mod.Event

import typings.plugapi.mod.LastPlay
import typings.plugapi.mod.Media
import typings.plugapi.mod.User.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advance extends js.Object {
  var currentDJ: DJ = js.native
  var djs: js.Array[DJ] = js.native
  var historyID: String = js.native
  var lastPlay: LastPlay = js.native
  var media: Media = js.native
  var playlistID: Double = js.native
  var startTime: String = js.native
}

object Advance {
  @scala.inline
  def apply(
    currentDJ: DJ,
    djs: js.Array[DJ],
    historyID: String,
    lastPlay: LastPlay,
    media: Media,
    playlistID: Double,
    startTime: String
  ): Advance = {
    val __obj = js.Dynamic.literal(currentDJ = currentDJ.asInstanceOf[js.Any], djs = djs.asInstanceOf[js.Any], historyID = historyID.asInstanceOf[js.Any], lastPlay = lastPlay.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], playlistID = playlistID.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advance]
  }
  @scala.inline
  implicit class AdvanceOps[Self <: Advance] (val x: Self) extends AnyVal {
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
    def setCurrentDJ(value: DJ): Self = this.set("currentDJ", value.asInstanceOf[js.Any])
    @scala.inline
    def setDjsVarargs(value: DJ*): Self = this.set("djs", js.Array(value :_*))
    @scala.inline
    def setDjs(value: js.Array[DJ]): Self = this.set("djs", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistoryID(value: String): Self = this.set("historyID", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPlay(value: LastPlay): Self = this.set("lastPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: Media): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaylistID(value: Double): Self = this.set("playlistID", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
  
}

