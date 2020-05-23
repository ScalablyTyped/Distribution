package typings.musicmatch.mod

import typings.musicmatch.anon.Albumid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackResult extends js.Object {
  var track: Albumid
}

object TrackResult {
  @scala.inline
  def apply(track: Albumid): TrackResult = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackResult]
  }
}

