package typings.musicmatch.anon

import typings.musicmatch.mod.TrackResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracklist extends js.Object {
  var track_list: js.Array[TrackResult]
}

object Tracklist {
  @scala.inline
  def apply(track_list: js.Array[TrackResult]): Tracklist = {
    val __obj = js.Dynamic.literal(track_list = track_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracklist]
  }
}

