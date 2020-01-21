package typings.musicmatch

import typings.musicmatch.mod.TrackResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTracklist extends js.Object {
  var track_list: js.Array[TrackResult]
}

object AnonTracklist {
  @scala.inline
  def apply(track_list: js.Array[TrackResult]): AnonTracklist = {
    val __obj = js.Dynamic.literal(track_list = track_list.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTracklist]
  }
}

