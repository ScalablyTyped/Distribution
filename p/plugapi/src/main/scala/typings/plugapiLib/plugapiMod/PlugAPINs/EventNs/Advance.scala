package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advance extends js.Object {
  var currentDJ: plugapiLib.plugapiMod.PlugAPINs.UserNs.DJ
  var djs: js.Array[plugapiLib.plugapiMod.PlugAPINs.UserNs.DJ]
  var historyID: java.lang.String
  var lastPlay: plugapiLib.plugapiMod.PlugAPINs.LastPlay
  var media: plugapiLib.plugapiMod.PlugAPINs.Media
  var playlistID: scala.Double
  var startTime: java.lang.String
}

object Advance {
  @scala.inline
  def apply(
    currentDJ: plugapiLib.plugapiMod.PlugAPINs.UserNs.DJ,
    djs: js.Array[plugapiLib.plugapiMod.PlugAPINs.UserNs.DJ],
    historyID: java.lang.String,
    lastPlay: plugapiLib.plugapiMod.PlugAPINs.LastPlay,
    media: plugapiLib.plugapiMod.PlugAPINs.Media,
    playlistID: scala.Double,
    startTime: java.lang.String
  ): Advance = {
    val __obj = js.Dynamic.literal(currentDJ = currentDJ, djs = djs, historyID = historyID, lastPlay = lastPlay, media = media, playlistID = playlistID, startTime = startTime)
  
    __obj.asInstanceOf[Advance]
  }
}

