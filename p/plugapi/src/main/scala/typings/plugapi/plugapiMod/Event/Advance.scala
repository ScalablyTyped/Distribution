package typings.plugapi.plugapiMod.Event

import typings.plugapi.plugapiMod.LastPlay
import typings.plugapi.plugapiMod.Media
import typings.plugapi.plugapiMod.User.DJ
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
    val __obj = js.Dynamic.literal(currentDJ = currentDJ, djs = djs, historyID = historyID, lastPlay = lastPlay, media = media, playlistID = playlistID, startTime = startTime)
  
    __obj.asInstanceOf[Advance]
  }
}

