package typings.plugapi.mod.Event

import typings.plugapi.mod.LastPlay
import typings.plugapi.mod.Media
import typings.plugapi.mod.User.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advance extends js.Object {
  var currentDJ: DJ
  var djs: js.Array[DJ]
  var historyID: String
  var lastPlay: LastPlay
  var media: Media
  var playlistID: Double
  var startTime: String
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
}

