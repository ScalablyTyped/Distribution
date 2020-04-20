package typings.musicmatch.mod

import typings.musicmatch.AnonAlbumid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackResult extends js.Object {
  var track: AnonAlbumid
}

object TrackResult {
  @scala.inline
  def apply(track: AnonAlbumid): TrackResult = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackResult]
  }
}

